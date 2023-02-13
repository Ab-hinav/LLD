package org.example;

public class ErrorLogger extends Logger {

    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void logMessage(int level, String message){
        if (level == Logger.ERROR){
            System.out.println("ERROR: " + message);
            return;
        }
        super.logMessage(level, message);
    }

}
