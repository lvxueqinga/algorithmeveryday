package com.lxq.algorithmeveryday;

/**
 * 选择排序， 给定数组由小到大排序
 * 第一轮， [0,n-1]找到最小值，最小值和0位置交换
 * 第二轮，[1,n-1]找到最小值，最小值和1位置交换
 *
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/04/10 22:34
 */
public class SelectSort {
    public static void main(String[] args) {


        int[] array = {3,52,1,1,4,6,0};

        int start = 0;
        int n = array.length;

        // 数组为空 或者 长度小于2， 不用排序 直接输出即可
        if (array==null || n<2 ){
            printout(array);
            return;
        }

        while (start < n-1){
            //找到最小值的index
            int index = findMinIndex(array,start,n-1);

            //最小值交换到前面
            int temp = array[start];
            array[start] = array[index];
            array[index] = temp;

            //start++
            start++;
        }

        //打印输出
        printout(array);

    }


    public static int findMinIndex(int [] arr, int left,int right){
        int index = -1;
        int min = Integer.MAX_VALUE;
        for (int i = left; i <= right; i++){
            if (min>arr[i]){
                min=arr[i];
                index=i;
            }
        }
        return index;
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
