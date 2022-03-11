package com.zyf.design.pattern.behavior.templatemethod;

public abstract class ACourse {
    //final方法 子类不能重写
    protected final  void makeCourse(){
        /*模板顺序*/
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作PPT");
    }

    final void makeVideo(){
        System.out.println("制作视频");
    }
    final void writeArticle(){
        System.out.println("编写手记");
    }

    //钩子方法
    protected boolean needWriteArticle(){
        return false;
    }

    abstract void packageCourse();
}
