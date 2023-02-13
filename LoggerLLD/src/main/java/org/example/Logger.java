package org.example;

public class Logger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;


    private Logger nextLogger = null;

    public Logger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if (this.nextLogger != null){
            this.nextLogger.logMessage(level, message);
        }
    }




}
