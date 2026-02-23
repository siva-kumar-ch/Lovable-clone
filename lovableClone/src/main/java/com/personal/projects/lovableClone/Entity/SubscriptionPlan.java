package com.personal.projects.lovableClone.Entity;

import java.time.Instant;

import org.springframework.boot.jackson.autoconfigure.JacksonProperties.Json;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SubscriptionPlan {
    
    Integer id;
    String name;
    String description;
    String thirdPartyReferenceId; //like reference of 3rd party payment gateway to buy this particular plan
    Integer maxProjectsAllowed;
    Integer maxPreviews;
    Integer maxTokens;
    Boolean unlimitedAIAccess;
    Json features;

    Boolean active;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
