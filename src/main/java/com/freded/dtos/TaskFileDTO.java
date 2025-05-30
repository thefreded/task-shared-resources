package com.freded.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * DTO for task file information.
 * Contains metadata about files associated with tasks.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskFileDTO {

    /**
     * Unique identifier for the file.
     */
    private String id;

    /**
     * Original name of the uploaded file.
     */
    private String fileName;

    /**
     * MIME type or file extension of the file.
     */
    private String fileType;

    /**
     * Timestamp when the file was created.
     */
    private LocalDateTime createdAt;
}