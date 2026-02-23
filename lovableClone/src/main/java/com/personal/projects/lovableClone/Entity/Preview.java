package com.personal.projects.lovableClone.Entity;

import java.time.Instant;

import com.personal.projects.lovableClone.Enum.PreviewStatus;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {
    Integer id;
    Project project;
    String namespace;
    String podName;
    String previewUrl;
    PreviewStatus status;

    Instant startedAt;
    Instant endedAt;
    Instant createdAt;
}
