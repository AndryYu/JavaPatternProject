package com.zyf.design.pattern.structural.composite;

public abstract class CatalogComponent {
    public void add( CatalogComponent component){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove( CatalogComponent component){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public Double getPrice(){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
