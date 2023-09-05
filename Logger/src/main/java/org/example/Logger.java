package org.example;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Logger {

    private final String fileName = "log.txt";
    private PrintWriter fileWriter;

    public Logger(){
        try{
            PrintWriter printWriter = new PrintWriter(fileName);
            this.fileWriter = printWriter;
        }catch (Exception e){

        }
    }

    public void logWidthDraw(String account,int amount){
        fileWriter.println("Widthdraw from "+account +" amount : "+amount);
    }

    public void logDeposit(String account,int amount){
        fileWriter.println("Deposit from "+account +" amount : "+amount);
    }

    public void logTransfer(String sender ,String reciever,int amount ){
        fileWriter.println(" transfer from "+sender + " to "+reciever+" amount :"+amount);
    }


}
