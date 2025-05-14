package com.freded.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskFileEntity {

    /**
     * Unique identifier for the file.
     */
    @Id
    private String id = UUID.randomUUID().toString();

    @NotNull(message = "File name cannot be null")
    @Column(unique = true, nullable = false)
    private String fileName;

    private String fileType;

    private LocalDateTime createdAt;

    private String uploadedBy;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    @JsonIgnore
    private TaskEntity task;


    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}