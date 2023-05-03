package org.example.Solution1;

public class Expression implements ArithmeticExpression{

    Number num1;
    Number num2;
    Operation operation;

    public Expression(Number n1,Number n2,Operation op){
        num1 = n1;
        num2 = n2;
        this.operation = op;
    }


    @Override
    public int evaluate() {
        int value=0;
        switch (operation){

            case ADD:
                value = num1.evaluate() + num2.evaluate();
                break;
            case SUBTRACT:
                value = num1.evaluate() - num2.evaluate();
                break;
            case DIVIDE:
                value = num1.evaluate() / num2.evaluate();
                break;
            case MULTIPLY:
                value = num1.evaluate() * num2.evaluate();
                break;
        }

        System.out.println("Expression value is :" + value);
        return value;
    }
}
