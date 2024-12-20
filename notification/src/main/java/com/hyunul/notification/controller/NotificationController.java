package com.hyunul.notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    // 이메일 알림 전송
    @PostMapping("/email")
    public void sendEmailNotification(@RequestBody Notification notification) {
        notificationService.sendEmailNotification(notification);
    }

    // SMS 알림 전송
    @PostMapping("/sms")
    public void sendSmsNotification(@RequestBody Notification notification) {
        notificationService.sendSmsNotification(notification);
    }
}
