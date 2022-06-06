package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public String saludoService(){
        return "saludos desde Service";
    }
}
