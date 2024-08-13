package DEMO;

public class DIPDemo {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        Application app = new Application(emailService);
        app.processMessages("Sup via Email");

        MessageService smsService = new SMSService();
        app = new Application(smsService);
        app.processMessages("Sup via SMS");
    }
}

