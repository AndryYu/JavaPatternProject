package com.zyf.design.pattern.behavior.memento;

import java.util.Stack;

public class ArticleMementoManager {
    private final Stack<ArticleMemento> mementoStack = new Stack<>();

    public ArticleMemento getMemento(){
        return mementoStack.pop();
    }

    public void addMemento(ArticleMemento articleMemento){
        mementoStack.add(articleMemento);
    }
}
