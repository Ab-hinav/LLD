package org.example.impl1;

import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private int dieCount;
    private int sides;

    public Die(int sides,int dieCount){
        this.sides = sides;
        this.dieCount = dieCount;
    }

    public int roll(){

        int sum = 0;
        for(int i = 0; i < dieCount; i++){
            sum += ThreadLocalRandom.current().nextInt(1, sides + 1);
        }

        return sum;
    }




}
