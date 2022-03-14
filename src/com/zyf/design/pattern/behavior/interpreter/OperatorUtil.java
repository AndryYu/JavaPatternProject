package com.zyf.design.pattern.behavior.interpreter;

import org.apache.commons.lang3.StringUtils;

public class OperatorUtil {
    public static boolean isOperator(String symbol){
        return StringUtils.equals(symbol,"+")||StringUtils.equals(symbol,"*");
    }

    public static Interpreter getExpressionObject(Interpreter first,Interpreter second,String symbol){
        if (symbol.equals("+")){
            return new AddInterpreter(first,second);
        }else if (symbol.equals("*")){
            return new MultiInterpreter(first,second);
        }
        return null;
    }

}
