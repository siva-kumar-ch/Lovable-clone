package com.personal.projects.lovableClone.Entity;

import lombok.Data;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMemberId {
    User user;
    Project project;
}
