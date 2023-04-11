package com.lxq.algorithmeveryday;

/**
 * 二分查找（基础及变形） ，
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/04/11 17:09
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,3,3,3,24,26,57,89,100};
//        System.out.println(find(100,array));
//        System.out.println(mostLeftNoLessNumIndex(3,array));
        System.out.println(mostRightNoLessNumIndex(3,array));

    }

    /**
     * 给定有序数组中，找到某个值
     */
    public static boolean find(int target, int[] arr){
       if (arr==null || arr.length==0){
           return false;
       }
       int L = 0;
       int R = arr.length-1;
       while (L<=R){
           int mid = (L+R)/2;
           if (arr[mid] == target){
               return true;
           }else if (arr[mid]>target){
               R = mid-1;
           }else {
               L = mid+1;
           }
       }
       return false;

    }


    /**
     * 有序数组中，找到>=num最左的位置
     */
    public static int mostLeftNoLessNumIndex(int target, int [] arr){
        if (arr==null || arr.length==0){
            return -1;
        }
        int L = 0;
        int R = arr.length-1;
        int t = -1;
        while (L<=R){
            int mid = (L+R)/2;
            if (arr[mid] >= target){
                t = mid;
                R = mid-1;

            }else {
                L = mid+1;
            }
        }
        return  t;

    }




    /**
     * 有序数组中，找到<=num最右的位置
     */
    public static int mostRightNoLessNumIndex(int target, int [] arr){
        if (arr==null || arr.length==0){
            return -1;
        }
        int L = 0;
        int R = arr.length-1;
        int t = -1;
        while (L<=R){
            int mid = (L+R)/2;
            if (arr[mid] <= target){
                t = mid;
                L = mid+1;

            }else {
                R = mid-1;
            }
        }
        return  t;

    }





    /**
     * 局部最小值问题
     */









}
