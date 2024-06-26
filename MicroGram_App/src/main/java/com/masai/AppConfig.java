package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.masai.repositary.ChatDAO;
import com.masai.repositary.MessageDAO;
import com.masai.services.ChatService;
import com.masai.services.MessageService;

@Configuration
public class AppConfig {

    @Bean
    public ChatDAO chatDAO() {
        return new ChatDAO();
    }

    @Bean
    public MessageDAO messageDAO() {
        return new MessageDAO();
    }

    @Bean
    public ChatService chatService() {
        return new ChatService(chatDAO());
    }

    @Bean
    public MessageService messageService() {
        return new MessageService(messageDAO());
    }
}

