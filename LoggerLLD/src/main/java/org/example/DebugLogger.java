package org.example;

public class DebugLogger extends Logger{

    public DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void logMessage(int level, String message){
        if (level == Logger.DEBUG){
            System.out.println("DEBUG: " + message);
            return;
        }
        super.logMessage(level, message);
    }



}
