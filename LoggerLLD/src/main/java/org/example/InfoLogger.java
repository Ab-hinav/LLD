package org.example;

public class InfoLogger extends Logger{

    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void logMessage(int level, String message){
        if (level == Logger.INFO){
            System.out.println("INFO: " + message);
            return;
        }
        super.logMessage(level, message);
    }

}
