package com.personal.projects.lovableClone.Entity;

import java.time.Instant;

import com.personal.projects.lovableClone.Enum.MessageRole;

public class ChatMessage {
    Integer id;
    User user;
    ChatSession chatSession;
    String content;
    Integer tokensUsed;
    MessageRole role;

    Instant createdAt;
}
