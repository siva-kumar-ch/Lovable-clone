package com.personal.projects.lovableClone.entity;

import lombok.Data;

import java.time.Instant;

import com.personal.projects.lovableClone.enums.SubscriptionStatus;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SubscriptionDetails {
    Integer id;

    User user;
    SubscriptionPlan subscriptionPlan;

    SubscriptionStatus status;

    String thirdPartyUserId;
    String thirdPartySubscriptionId;

    Instant subscriptionStartDate;
    Instant subscriptionEndDate;
    Instant subscriptionCancelledDate;

    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
