package DEMO;

public class InfoHandler extends LogHandler {
    @Override
    protected boolean canHandle(LogLevel logLevel) {
        return logLevel == LogLevel.INFO;
    }

    @Override
    protected void writeLog(String message) {
        System.out.println("INFO: " + message);
    }
}
