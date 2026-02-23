package com.personal.projects.lovableClone.Entity;

import java.time.Instant;

import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class ProjectFile {
    Integer id;
    Project project;
    String fileName;
    String filePath; // needed for created tree of src code 
    String fileType;
    Long size;
    String minIoUrl; //this is actually the minIo file path

    User createdBy;
    User updatedBy;

    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
