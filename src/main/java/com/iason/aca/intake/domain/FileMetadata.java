package com.iason.aca.intake.domain;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: FileMetadata
 * Inside the package - com.iason.aca.intake.domain
 * Created Date: 5/7/2020
 * Created Time: 10:26 AM
 **/
@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FILE_EXCHANGE_TRACKER")
public class FileMetadata {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "file_exchange_sequence")
    @SequenceGenerator(name="file_exchange_sequence", sequenceName = "file_exchange_sequence",
            initialValue = 10001, allocationSize = 1)
    @Column(updatable = false, nullable = false)
    private Long fileId;

    private String sourceFileName;

    private Timestamp fileReceivedDateTime;

    private String fileStatus;
//
//    private String fileTypeCode;
//
//    private String fileControlNumber;
//
//    private String fileSenderIdentifier;
//
//    private String fileReceiverIdentifier;
//
//    private String fileStatus;
//
//    private Timestamp fileCreatedDateTime;

}
