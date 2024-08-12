package DEMO;

public class Client {
    public static void main(String[] args) {
        // Set up the handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        // Set the chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create logger and commands
        Logger logger = new Logger();
        logger.addCommand(new LogCommand(infoHandler, LogLevel.INFO));
        logger.addCommand(new LogCommand(debugHandler, LogLevel.DEBUG));
        logger.addCommand(new LogCommand(errorHandler, LogLevel.ERROR));

        // Execute the logging commands
        logger.executeCommands();
    }
}
