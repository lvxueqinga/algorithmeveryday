package com.lxq.algorithmeveryday;

/**
 * 冒泡排序，给定数组由小到大排序
 * 第一轮， [0,n-1]， 从头开始 两两比较 前大后小则交换
 * 第二轮， [0,n-2], 从头开始 两两比较 前大后小则交换
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/04/10 23:20
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,6,5,4,3,2,1};
        bubble(array);
    }


    public static void bubble(int [] array){
        int n = array.length;

        if (array==null || n<2){
            printout(array);
            return;
        }

        // 每轮过后，最大的都放在了最后，右边界往前移
        for (int right = n-1;right>0;right--){
            int start = 0; // 开头
            int next = 1; //开头的后一个

            //从头往后，两两比较， 但是不能超过右边界
            while (next <= right){
                //如果前面比后面大则交换
                if(array[start] > array[next]){
                    int temp = array[start];
                    array[start] = array[next];
                    array[next] = temp;
                }
                start = next;
                next = next + 1;
            }

        }

        printout(array);

    }


    public static void printout(int [] array){
        if (array == null){
            System.out.print( "[]");
            return;
        }
        for (int i = 0 ; i < array.length;i++){
            System.out.print(array[i] + ", ");
        }
    }

}
