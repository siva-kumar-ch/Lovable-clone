package com.personal.projects.lovableClone.Entity;

import lombok.Data;

import java.time.Instant;

import com.personal.projects.lovableClone.Enum.ProjectRole;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {
    
    ProjectMemberId id;
    ProjectRole role;

    User invitedBy;
    String invitationStatus;
    Instant invitedAt;
    Instant acceptedAt;
}
