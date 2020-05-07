package com.iason.aca.intake.services;

import com.iason.aca.intake.domain.FileMetadata;
import com.iason.aca.intake.web.model.FileMetadataDto;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: IFileTrackerService
 * Inside the package - com.iason.aca.intake.services
 * Created Date: 5/7/2020
 * Created Time: 4:02 PM
 **/
public interface IFileTrackerService {
    Long startTrackingFile(FileMetadataDto fileMetadataDto);
    void receiveEnrollmentMessage(FileMetadataDto fileMetadataDto);
}
