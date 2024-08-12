package DEMO;

public class ErrorHandler extends LogHandler {
    @Override
    protected boolean canHandle(LogLevel logLevel) {
        return logLevel == LogLevel.ERROR;
    }

    @Override
    protected void writeLog(String message) {
        System.out.println("ERROR: " + message);
    }
}
