package ru.geekbrains.lesson4;

import java.time.LocalDateTime;

public class TextMessage {
    private LocalDateTime created ;
    private String userName;
    private String text;

    public TextMessage(String userName, String teat) {
        this.created = LocalDateTime.now();
        this.userName = userName;
        this.text = teat;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}
