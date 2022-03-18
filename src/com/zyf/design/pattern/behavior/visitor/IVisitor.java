package com.zyf.design.pattern.behavior.visitor;

public interface IVisitor {
    void visit(FreeCourse course);
    void visit(CodingCourse codingCourse);
}
