package com.hyunul.notification.service;

import org.springframework.stereotype.Service;

import com.hyunul.notification.model.Notification;

@Service
public class NotificationService {

    public void sendEmailNotification(Notification notification) {
        // 이메일 발송 로직
    }

    public void sendSmsNotification(Notification notification) {
        // SMS 발송 로직
    }
}
