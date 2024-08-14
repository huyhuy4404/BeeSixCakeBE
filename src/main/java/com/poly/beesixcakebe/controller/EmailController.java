package com.poly.beesixcakebe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.poly.beesixcakebe.service.EmailService;
import com.poly.beesixcakebe.model.EmailRequest;

@RestController
@RequestMapping("/api/mail")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public String sendMail(@RequestBody EmailRequest emailRequest) {
        emailService.sendSimpleEmail(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getText());
        return "Email sent successfully!";
    }
}

