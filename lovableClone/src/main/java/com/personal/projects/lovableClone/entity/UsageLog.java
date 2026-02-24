package com.personal.projects.lovableClone.entity;

import lombok.Data;

import java.time.Instant;

import org.springframework.boot.jackson.autoconfigure.JacksonProperties.Json;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsageLog {
    Integer id;
    User user;
    Project project;
    String action;
    String tokensConsumed;
    String duration;
    Json metadata;

    Instant createdAt;// there will be no updatedAt or deletedAt as this is just a log and we won't be updating or deleting it
}
