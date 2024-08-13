package DEMO;

public class Application {
    private MessageService messageService;

    public Application(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessages(String message) {
        messageService.sendMessage(message);
        System.out.println("Message processed: " + message);
    }
}

