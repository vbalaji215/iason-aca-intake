package com.iason.aca.intake.repositories;

import com.iason.aca.intake.domain.FileMetadata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: FileMetadataRepository
 * Inside the package - com.iason.aca.intake.repositories
 * Created Date: 5/7/2020
 * Created Time: 4:07 PM
 **/
@Repository
public interface FileMetadataRepository extends JpaRepository<FileMetadata, Long> {
}
