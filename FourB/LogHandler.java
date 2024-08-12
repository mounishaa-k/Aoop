package DEMO;

public abstract class LogHandler {
    protected LogHandler nextHandler;

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(LogLevel logLevel, String message) {
        if (canHandle(logLevel)) {
            writeLog(message);
        } else if (nextHandler != null) {
            nextHandler.handle(logLevel, message);
        } else {
            System.out.println("No handler found for log level: " + logLevel);
        }
    }

    protected abstract boolean canHandle(LogLevel logLevel);

    protected abstract void writeLog(String message);
}
