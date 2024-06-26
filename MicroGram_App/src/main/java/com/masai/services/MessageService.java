package com.masai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.masai.model.Message;
import com.masai.repositary.MessageDAO;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    private final MessageDAO messageDAO;

    @Autowired
    public MessageService(MessageDAO messageDAO) {
        this.messageDAO = messageDAO;
    }

    public List<Message> getAllMessages() {
        return messageDAO.getAllMessages();
    }

    public Optional<Message> getMessageById(Long id) {
        return messageDAO.getMessageById(id);
    }

    public List<Message> getMessagesByChatId(Long chatId) {
        return messageDAO.getMessagesByChatId(chatId);
    }

    public Message saveMessage(Message message) {
        return messageDAO.saveMessage(message);
    }

    public void deleteMessage(Long id) {
        messageDAO.deleteMessage(id);
    }
}
