package com.freded.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jboss.resteasy.reactive.RestForm;
import org.jboss.resteasy.reactive.multipart.FileUpload;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskFileUploadDTO {

    @RestForm("fileName")
    private String fileName;

    @RestForm("file")
    private FileUpload fileUpload;
}
