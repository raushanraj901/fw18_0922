package com.masai.repositary;

import org.springframework.stereotype.Repository;

import com.masai.model.Chat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class ChatDAO {
    private final List<Chat> chats = new ArrayList<>();

    public ChatDAO() {
        // Sample hardcoded values
        chats.add(new Chat(1L, "Chat 1"));
        chats.add(new Chat(2L, "Chat 2"));
    }

    public List<Chat> getAllChats() {
        return chats;
    }

    public Optional<Chat> getChatById(Long id) {
        return chats.stream().filter(chat -> chat.getId().equals(id)).findFirst();
    }

    public Chat saveChat(Chat chat) {
        chats.add(chat);
        return chat;
    }

    public void deleteChat(Long id) {
        chats.removeIf(chat -> chat.getId().equals(id));
    }
}
