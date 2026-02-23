package com.personal.projects.lovableClone.Entity;

import lombok.Data;

import java.time.Instant;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {
    Integer id;
    String name;
    String description;
    User owner;
    Boolean isPublic;

    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
