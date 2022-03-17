package com.zyf.design.pattern.behavior.memento;

public class Test {

    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();
        Article article = new Article("如影随形的设计模式A","手记内容A","手记图片A");
        ArticleMemento articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        System.out.println("标题："+article.getTitle()+"内容："+article.getContent()+"图片："+article.getImgs());
        System.out.println("手记完整信息："+article);

        article.setTitle("设计模式B");
        article.setContent("手记内容B");
        article.setImgs("手记图片B");
        System.out.println("手记完整信息："+article);

        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        System.out.println("回退1");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);
        System.out.println("手记完整信息："+article);

        System.out.println("回退2");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);
        System.out.println("手记完整信息："+article);
    }
}
