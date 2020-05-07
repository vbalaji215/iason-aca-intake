package com.iason.aca.intake.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iason.aca.intake.domain.Enrollment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: EnrollmentDataConsumer
 * Inside the package - com.iason.aca.intake.consumer
 * Created Date: 5/6/2020
 * Created Time: 4:57 PM
 **/
@Service
@Slf4j
public class EnrollmentDataConsumer {

    private ObjectMapper objectMapper;

    public EnrollmentDataConsumer(ObjectMapper objectMapper){
        this.objectMapper = objectMapper;
    }

    @KafkaListener(topics = "enrollments", groupId = "aca-enrollment-intake")
    public void consumeEnrollmentData(String enrollmentMessage) throws JsonProcessingException {
        Enrollment enrollment = objectMapper.readValue(enrollmentMessage, Enrollment.class);
        log.info("Enrollment Data is: {}", enrollmentMessage);
    }
}
