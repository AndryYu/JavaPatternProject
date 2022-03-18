package com.zyf.design.pattern.behavior.interpreter;

public class MultiInterpreter implements Interpreter{
    private  Interpreter firstExpression, secondExpression;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }


    @Override
    public int interpret() {
        return this.firstExpression.interpret()*this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}