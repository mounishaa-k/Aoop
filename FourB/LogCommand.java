package DEMO;

public class LogCommand implements Command {
    private LogHandler logHandler;
    private LogLevel logLevel;

    public LogCommand(LogHandler logHandler, LogLevel logLevel) {
        this.logHandler = logHandler;
        this.logLevel = logLevel;
    }

    @Override
    public void execute(String message) {
        System.out.println("Executing log command for level: " + logLevel);
        logHandler.handle(logLevel, message);
    }
}
