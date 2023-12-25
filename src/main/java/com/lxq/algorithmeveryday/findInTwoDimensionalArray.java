package com.lxq.algorithmeveryday;

/**
 * 二维数组中的查找
 *
 * 一个二维数组， 每一行从左到右递增， 每一列从上到下递增，输入一个二维数组和一个整数，判断数组中是否含有整数
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/06/28 17:13
 */
public class findInTwoDimensionalArray {

    public boolean chknum(int [][] array, int target){
        if (array==null){
            return false;
        }
        //判断 target 和全数组最小
        if (array[0][0] > target){
            return  false;
        }
        if (array[0][0] == target){
            return  true;
        }

        int maxrow = array.length-1;
        int maxcol = array[0].length-1;

        //当前行 当前列
        int nowrow = 0;
        int nowcol = maxcol;
        //最大的数<target, 则没有
        if (array[maxrow][maxcol] < target){
            return false;
        }

        //从上到下  当前行最大<target, 则下一行
        while (nowrow< maxrow && array[nowrow][nowcol] < target){
            nowrow++;
        }


        //当前行的最大>=target， 则在当前行找
        if (array[nowrow][nowcol]>=target){
            while (nowcol>0){
                if (array[nowrow][nowcol]==target){
                    return true;
                }else {
                    nowcol--;
                }
            }
        }
        return false;


    }
    public static void main(String[] args) {

        int [][] arr = new int[4][4];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;
        arr[1][0] = 5;
        arr[1][1] = 6;
        arr[1][2] = 7;
        arr[1][3] = 8;
        arr[2][0] = 9;
        arr[2][1] = 10;
        arr[2][2] = 15;
        arr[2][3] = 16;
        arr[3][0] = 17;
        arr[3][1] = 18;
        arr[3][2] = 19;
        arr[3][3] = 30;

        findInTwoDimensionalArray obj = new findInTwoDimensionalArray();
        System.out.println(obj.chknum(arr,0));

    }
}
