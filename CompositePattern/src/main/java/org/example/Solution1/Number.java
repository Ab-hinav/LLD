package org.example.Solution1;

public class Number implements ArithmeticExpression{

    int value;

    public Number(int v){
        value = v;
    }

    @Override
    public int evaluate() {
        System.out.println("Number value is "+ value);
        return value;
    }
}
