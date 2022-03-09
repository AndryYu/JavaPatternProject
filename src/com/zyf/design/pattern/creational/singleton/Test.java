package com.zyf.design.pattern.creational.singleton;

public class Test {
    public static void main(String[] args) {
        //LazySingleton lazySingleton = LazySingleton.getInstance();
        //System.out.println("program end");

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();

        //序列化和反序列化
        /*HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
            oos.writeObject(hungrySingleton);

            File file = new File("singleton_file");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            HungrySingleton singleton = (HungrySingleton) ois.readObject();

            System.out.println(singleton);
            System.out.println(hungrySingleton);
            System.out.println(hungrySingleton==singleton);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        //反射
       /* Class objectClass = HungrySingleton.class;
        try {
            Constructor constructor = objectClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            HungrySingleton hungrySingleton = HungrySingleton.getInstance();
            HungrySingleton singleton = (HungrySingleton) constructor.newInstance();

            System.out.println(singleton);
            System.out.println(hungrySingleton);
            System.out.println(hungrySingleton==singleton);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }*/

        /*Class objectClass = StaticInnerClassSingleton.class;
        try {
            Constructor constructor = objectClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            StaticInnerClassSingleton hungrySingleton = StaticInnerClassSingleton.getInstance();
            StaticInnerClassSingleton singleton = (StaticInnerClassSingleton) constructor.newInstance();

            System.out.println(singleton);
            System.out.println(hungrySingleton);
            System.out.println(hungrySingleton==singleton);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }*/

        //枚举单例
        /*EnumInstance hungrySingleton = EnumInstance.getInstance();
        hungrySingleton.setData(new Object());
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
            oos.writeObject(hungrySingleton);

            File file = new File("singleton_file");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            EnumInstance singleton = (EnumInstance) ois.readObject();

            System.out.println(singleton.getData());
            System.out.println(hungrySingleton.getData());
            System.out.println(hungrySingleton.getData()==singleton.getData());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }*/

       /* Class objectClass = EnumInstance.class;
        try {
            Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
            EnumInstance hungrySingleton = (EnumInstance) constructor.newInstance("AndryYu", 8888);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
