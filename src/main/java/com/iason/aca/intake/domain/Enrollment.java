package com.iason.aca.intake.domain;

import com.iason.aca.intake.domain.envelope.ISA;
import lombok.*;

import java.time.OffsetDateTime;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Enrollment
 * Inside the package - com.iason.aca.enrollment.generation.domain
 * Created Date: 5/5/2020
 * Created Time: 6:27 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Enrollment {

    private String sourceFileName;

    private OffsetDateTime fileReceivedDateTime;

    private ISA isa;
}
