package com.zyf.design.pattern.behavior.visitor;

public class FreeCourse extends Course{

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
