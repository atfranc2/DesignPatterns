package com.DesignPatterns.BehaviouralPatterns.chainOfResponsibility;

public class HttpRequest {
    private String userName;
    private String password;
    private String content;

    public HttpRequest(String userName, String password, String content) {
        this.userName = userName;
        this.password = password;
        this.content = content;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getContent() {
        return content;
    }
}
