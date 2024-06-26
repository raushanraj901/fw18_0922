package com.masai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.masai.model.Chat;
import com.masai.repositary.ChatDAO;

import java.util.List;
import java.util.Optional;

@Service
public class ChatService {
    private final ChatDAO chatDAO;

    @Autowired
    public ChatService(ChatDAO chatDAO) {
        this.chatDAO = chatDAO;
    }

    public List<Chat> getAllChats() {
        return chatDAO.getAllChats();
    }

    public Optional<Chat> getChatById(Long id) {
        return chatDAO.getChatById(id);
    }

    public Chat saveChat(Chat chat) {
        return chatDAO.saveChat(chat);
    }

    public void deleteChat(Long id) {
        chatDAO.deleteChat(id);
    }
}

