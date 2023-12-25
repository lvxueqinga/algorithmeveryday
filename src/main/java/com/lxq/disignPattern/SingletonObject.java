package com.lxq.disignPattern;

/**
 * 单例模式，创建对象
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/06/28 16:54
 */
public class SingletonObject {

    /**
     * 饿汉单例
     *
     * 线程安全
     * 未加锁，效率高
     * 初始即加载，浪费内存
     */


//    //上来就创建对象
//    private static SingletonObject instance = new SingletonObject();
//    //构造函数私有化
//    private SingletonObject(){}
//    //调用返回
//    public static SingletonObject getInstance(){
//        return instance;
//    }
//    //测试输出
//    public void sayhi(){
//        System.out.println(" hello world");
//    }


    /**
     *
     * 懒汉单例
     */

    private static SingletonObject instance = null;
    //构造函数私有化
    private SingletonObject(){}
    //调用返回
    public static synchronized  SingletonObject getInstance(){
        if (instance==null){
            instance = new SingletonObject();
        }
        return  instance;
    }
    //测试输出
    public void sayhi(){
        System.out.println(" hello world");
    }



}
