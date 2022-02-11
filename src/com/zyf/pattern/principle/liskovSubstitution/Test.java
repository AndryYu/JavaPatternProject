package com.zyf.pattern.principle.liskovSubstitution;

public class Test {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() < rectangle.getHeight()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("Rectangle width=" + rectangle.getWidth() + " height" + rectangle.getHeight());

        }
        System.out.println("resize方法结束  width=" + rectangle.getWidth() + " height" + rectangle.getHeight());
    }

    public static void main(String[] args) {
        //长方形
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(24);
        resize(rectangle);

        //正方形
        Square square = new Square();
        square.setSideLength(12);
        //resize(square);
    }
}
