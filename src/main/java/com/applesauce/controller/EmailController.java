package com.applesauce.controller;

import javax.mail.MessagingException;

import com.applesauce.email.MailManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @RequestMapping("/send-mail")
    public void sendMail() throws MessagingException {

        MailManager mailSender = new MailManager();
        mailSender.send("xxxxx", "Test my app", "Howdy Sexy");

    }


}