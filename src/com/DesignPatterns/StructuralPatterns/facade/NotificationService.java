package com.DesignPatterns.StructuralPatterns.facade;

public class NotificationService {
    private NotificationServer server = new NotificationServer();
    private String appId = "app1";
    private String key = "1234";
    private String ipAddress = "IP12233";

    public void send(String message, String target) {
        var connection = server.connect(ipAddress);
        var auth = server.authenticate(appId, key);
        var mess = new Message(message);
        server.send(auth, mess, target);
        connection.disconnect();
    }

}
