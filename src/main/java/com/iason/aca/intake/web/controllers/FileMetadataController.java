package com.iason.aca.intake.web.controllers;

import com.iason.aca.intake.web.model.FileMetadataDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: FileMetadataController
 * Inside the package - com.iason.aca.intake.web.controllers
 * Created Date: 5/6/2020
 * Created Time: 8:34 PM
 **/
@RestController
@Slf4j
public class FileMetadataController {

    @PostMapping(value = "/files")
    public String createFileRecord(@RequestBody FileMetadataDto filemetadata){
      log.info("File Metadata: {}",filemetadata);
      return "323424";
    }
}
