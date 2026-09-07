package com.example.KnowledgeBot.service;

import com.example.KnowledgeBot.dto.ChatRequest;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ChatServiceImpl implements ChatService{

    private final ChatModel chatModel;

    public ChatServiceImpl(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @Override
    public String generateResponse(ChatRequest chatRequest) {
        return chatModel.call(chatRequest.message());
    }
}
