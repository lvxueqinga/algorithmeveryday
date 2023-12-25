package com.lxq.algorithmeveryday;

/**
 * 打印从 1 到最大的 n 位数
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/06/29 12:45
 */
public class print1ToMaxNDigits {


    public void print1ToMaxOfNDigits(int n) {
        if (n <= 0)
            return;
        char[] number = new char[n];
        print1ToMaxOfNDigits(number, 0);
    }

    private void print1ToMaxOfNDigits(char[] number, int digit) {
        if (digit == number.length) {       // 递归结束的条件：设置到了个位
            printNumber(number);
            return;
        }

        // 该算法的核心递归
        for (int i = 0; i < 10; i++) {
            number[digit] = (char) (i + '0');
            print1ToMaxOfNDigits(number, digit + 1);
        }
    }

    private void printNumber(char[] number) {
        int index = 0;
        while (index < number.length && number[index] == '0')       // 忽略前面的0
            index++;
        while (index < number.length)
            System.out.print(number[index++]);
        System.out.println();
    }

    public static void main(String[] args) {

        print1ToMaxNDigits a = new print1ToMaxNDigits();
        a.print1ToMaxOfNDigits(2);
    }

}
