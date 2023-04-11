package com.lxq.algorithmeveryday;

/**
 * 给定参数N，返回1!+2!+3!..+N!的结果
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/04/10 22:25
 */
public class factorialPlus {
    public static void main(String[] args) {
        System.out.println(getsum(10));
    }

    public static long getsum(int N){
        if (N==0){
            return 0;
        }
        int sum = 0;
        int now = 1;
        for (int i = 1; i <= N ;i++){
            now = now * i;
            sum = sum + now;
        }
        return sum;
    }
}
