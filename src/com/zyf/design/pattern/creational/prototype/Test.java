package com.zyf.design.pattern.creational.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        /*Mail mail = new Mail();
        mail.setContent("初始化模块");
        System.out.println("初始化Mail"+mail);
        for (int i = 0; i < 10; i++) {
            Mail mailtemp = (Mail) mail.clone();
            mailtemp.setName("姓名"+i);
            mailtemp.setEmailAddress("姓名"+i+"@imooc.com");
            mailtemp.setContent("恭喜您，此次慕课网活动中奖了");
            MailUtil.sendMail(mailtemp);
            System.out.println("克隆Mail"+mailtemp);
        }

        MailUtil.saveOriginMailRecord(mail);*/

        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        HungrySingleton cloneSingleton = (HungrySingleton) hungrySingleton.clone();

        System.out.println(hungrySingleton);
        System.out.println(cloneSingleton);

    }
}
