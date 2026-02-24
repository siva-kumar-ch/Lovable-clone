package com.personal.projects.lovableClone.entity;

import java.time.Instant;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatSession {
    User user;
    Project project;
    String title;

    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
