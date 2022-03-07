package com.zyf.pattern.structural.adapter;

public class PowerAdapter implements DC5{
    private  AC220 ac220 = new AC220();
    @Override
    public int outputDC5() {
        int adapterInput = ac220.outputAC220();
        //变压器。。。
        int adapterOutput = adapterInput/44;
        System.out.println("使用PowerAdapter输出DC:"+adapterOutput+"V");
        return adapterOutput;
    }
}
