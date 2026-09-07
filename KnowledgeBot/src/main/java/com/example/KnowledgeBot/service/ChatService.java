package com.example.KnowledgeBot.service;

import com.example.KnowledgeBot.dto.ChatRequest;


public interface ChatService {
    String generateResponse(ChatRequest chatRequest);
}
