package com.lxq.disignPattern;

/**
 * 测试单例模式
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/06/28 16:58
 */
public class Singleton_test {
    public static void main(String[] args) {
        SingletonObject singleton = SingletonObject.getInstance();
        singleton.sayhi();
        System.out.println(singleton);

        SingletonObject singleton2 = SingletonObject.getInstance();
        System.out.println(singleton2);
    }



}
