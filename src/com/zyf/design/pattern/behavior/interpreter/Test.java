package com.zyf.design.pattern.behavior.interpreter;

public class Test {
    public static void main(String[] args) {
        String inputStr = "6 100 20 + *";
        GeelyExpressionParser parser = new GeelyExpressionParser();
        int result  = parser.parse(inputStr);
        System.out.println("解释器计算结果："+result);
    }
}
