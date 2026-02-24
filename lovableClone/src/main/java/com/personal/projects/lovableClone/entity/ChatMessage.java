package com.personal.projects.lovableClone.entity;

import java.time.Instant;

import com.personal.projects.lovableClone.enums.MessageRole;

public class ChatMessage {
    Integer id;
    User user;
    ChatSession chatSession;
    String content;
    Integer tokensUsed;
    MessageRole role;

    Instant createdAt;
}
