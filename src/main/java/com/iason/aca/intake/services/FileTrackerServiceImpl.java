package com.iason.aca.intake.services;

import com.iason.aca.intake.domain.FileMetadata;
import com.iason.aca.intake.repositories.FileMetadataRepository;
import com.iason.aca.intake.web.mapper.FileMetadataMapper;
import com.iason.aca.intake.web.model.FileMetadataDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: FileTrackerServiceImpl
 * Inside the package - com.iason.aca.intake.services
 * Created Date: 5/7/2020
 * Created Time: 4:02 PM
 **/
@Service
@Slf4j
public class FileTrackerServiceImpl implements IFileTrackerService{

    private FileMetadataRepository repository;

    private FileMetadataMapper fileMetadataMapper;

    public FileTrackerServiceImpl(FileMetadataRepository repository,
                                  FileMetadataMapper fileMetadataMapper){
        this.fileMetadataMapper = fileMetadataMapper;
        this.repository = repository;
    }

    @Override
    public Long startTrackingFile(FileMetadataDto fileMetadataDto) {
        log.info("Status of the file in DTO: {}", fileMetadataDto.getFileStatus());
        FileMetadata fileMetadata =
                fileMetadataMapper.fileMetadataDtoToFileMetadata(fileMetadataDto);
        log.info("Status of the file: {}", fileMetadata.getFileStatus());
        FileMetadata savedFile = repository.save(fileMetadata);
        return savedFile.getFileId();
    }
}
