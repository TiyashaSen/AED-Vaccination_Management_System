/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vaccination.Notify;

import java.util.Date;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

/**
 *
 * @author prakruthisomashekar
 */
public  class SendEmail {
    
    
    public void sendMail(String patientName, String toEmail, String medicine, String age) throws Exception{
     Properties properties = new Properties();
     properties.put("mail.smtp.auth", "true");
     properties.put("mail.smtp.starttls.enable", "true");
     properties.put("mail.smtp.host", "smtp.gmail.com");
     properties.put("mail.smtp.port", "587");
     properties.put("mail.transport.protocol", "smtp");
     
     Session session = Session.getInstance(properties, new Authenticator(){
         @Override
         protected PasswordAuthentication getPasswordAuthentication(){
             return new PasswordAuthentication("bostonhealthservice@gmail.com", "flemhtqfurzhrvmo");
         }         
     });
     
     Message message = new MimeMessage(session);
     message.setSubject( patientName +" Prescrition");
     
     
     Address toAddress = new InternetAddress(toEmail);
     message.setRecipient(Message.RecipientType.TO, toAddress);
     
     MimeMultipart multipart = new MimeMultipart();   
     
     MimeBodyPart messageBody = new MimeBodyPart();
     
     messageBody.setContent("Boston Medical Center Medical Prescription" + "\n\n" + 
             "------------------------------" + "\n" +
             "Patient Name :" + patientName + "\n" + "Age: " + age + "\n" + "Date : " 
             + new Date().toString() + "\n" + "Medicine : " + medicine + "\n" 
             + "------------------------------" + "\n" , "text/plain");
     multipart.addBodyPart(messageBody);
     message.setContent(multipart);
     Transport.send(message);         
    }
}

