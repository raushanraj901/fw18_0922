package com.masai.model;

public class Message {
    private Long id;
    private String content;
    private Long chatId;

    // Constructor
    public Message(Long id, String content, Long chatId) {
        this.id = id;
        this.content = content;
        this.chatId = chatId;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }
}


