package com.lxq.algorithmeveryday;

/**
 * 插入排序 由小到大
 * [0,0] 位置有序
 * [0,1] 位置有序， 如果arr[1]<arr[0], 则交换
 * [0,2] 位置有序，arr[2]和前面的依次比较
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/04/11 10:38
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] array = {7,6,5,4,3,2,1};
        insertsort(array);
    }


    public static void insertsort(int [] array){
        int n = array.length;

        if (array==null || n<2){
            printout(array);
            return;
        }

        // 每轮保证[0，i]位置有序
        for (int i = 1; i < n;i++){

            int newNumIndex = i;
            //当 当前位置的前一个在0及之后 && 前面的值>当前值 则交换
            while (newNumIndex-1>=0 && array[newNumIndex-1] > array[newNumIndex]){
                int temp = array[newNumIndex-1];
                array[newNumIndex-1] = array[newNumIndex];
                array[newNumIndex] = temp;

                newNumIndex--;
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
