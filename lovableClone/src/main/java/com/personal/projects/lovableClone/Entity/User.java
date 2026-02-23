package com.personal.projects.lovableClone.Entity;

import java.time.Instant;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    Integer id;
    String name;
    String email;
    String password;
    String profileImageUrl;

    Boolean active;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
