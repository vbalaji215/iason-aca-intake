package com.iason.aca.intake.web.mapper;

import com.iason.aca.intake.domain.FileMetadata;
import com.iason.aca.intake.web.model.FileMetadataDto;
import org.mapstruct.Mapper;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: FileMetaDataMapper
 * Inside the package - com.iason.aca.intake.web.mapper
 * Created Date: 5/7/2020
 * Created Time: 11:12 AM
 **/
@Mapper(uses = {DateMapper.class})
public interface FileMetadataMapper {

    FileMetadataDto fileMetadatatoFileMetadataDto(FileMetadata fileMetadata);
    FileMetadata fileMetadataDtoToFileMetadata(FileMetadataDto fileMetadataDto);
}
