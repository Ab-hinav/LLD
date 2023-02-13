package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        logger.logMessage(Logger.INFO, "This is an info message");
        logger.logMessage(Logger.DEBUG, "This is a debug message");
        logger.logMessage(Logger.ERROR, "This is an error message");





    }
}