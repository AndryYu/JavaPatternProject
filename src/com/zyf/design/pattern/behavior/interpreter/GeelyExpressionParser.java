package com.zyf.design.pattern.behavior.interpreter;

import java.util.Stack;

public class GeelyExpressionParser {
    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str){
        String[] strings = str.split(" ");
        for (String symbol: strings) {
            if (!OperatorUtil.isOperator(symbol)){
                Interpreter numExpression = new NumberInterpreter(symbol);
                stack.push(numExpression);
                System.out.println(String.format("入栈：%d",numExpression.interpret()));
            }else{
                Interpreter first = stack.pop();
                Interpreter second = stack.pop();
                System.out.println(String.format("出栈：%d和%d",first.interpret(), second.interpret()));

                Interpreter operator = OperatorUtil.getExpressionObject(first,second,symbol);
                int result = 0;
                if (operator != null) {
                    result = operator.interpret();
                }
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.println(String.format("阶段结果入栈：%d",resultExpression.interpret()));
            }
        }

        return stack.pop().interpret();
    }
}
