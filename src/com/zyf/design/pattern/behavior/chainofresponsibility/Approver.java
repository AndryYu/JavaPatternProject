package com.zyf.design.pattern.behavior.chainofresponsibility;

public abstract class Approver {
    //责任链包含一个自己类型的对象
    protected  Approver approver;

    public void setNextApprover(Approver approver){
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
