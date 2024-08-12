package DEMO;

public class DebugHandler extends LogHandler {
    @Override
    protected boolean canHandle(LogLevel logLevel) {
        return logLevel == LogLevel.DEBUG;
    }

    @Override
    protected void writeLog(String message) {
        System.out.println("DEBUG: " + message);
    }
}
