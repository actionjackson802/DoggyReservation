package com.applesauce.email;

/**
 * Created by JacksonChang408 on 6/9/2016.
 */

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import java.io.IOException;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class MailManager {

    public void send(String to, String subject, String body) throws MessagingException {

        Properties properties = new Properties();

        try{
            // Load properties file
            properties.load(this.getClass().getClassLoader().getResourceAsStream("application.properties"));

            // Get the default Session object.
            Session session = Session.getDefaultInstance(properties,new Authenticator(){
                protected PasswordAuthentication getPasswordAuthentication() {
                    Properties p = new Properties();
                    try {
                        p.load(this.getClass().getClassLoader().getResourceAsStream("application.properties"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return new PasswordAuthentication(p.getProperty("mail.username"), p.getProperty("mail.password"));
                }});

            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(properties.getProperty("mail.from")));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(body);

            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        }catch (MessagingException mex) {
            mex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
