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
//        int[] array = {1,3,3,3,24,26,57,89,100};
        int[] array2 = {100,99,98,102};
//        System.out.println(find(100,array));
//        System.out.println(mostLeftNoLessNumIndex(3,array));
//        System.out.println(mostRightNoLessNumIndex(3,array));
        System.out.println(getMinInArea(array2));

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
     *
     * 一个数组[0，n-1]， 无序， 任意相邻的两个数不相等
     * 局部最小条件：
     *  1）若 arr[0] < arr[1], 则arr[0]局部最小
     *  2）若 arr[n-1] < arr[n-2], 则arr[n-1]局部最小
     *  1）若 arr[i-1] > arr[i] < arr[i+1], 则arr[i]局部最小
     *
     *  返回数组的其中一个局部最小的index
     *
     *  PS： \ / 中间一定存在局部最小
     */

    public static int getMinInArea(int [] arr){
        if (arr==null || arr.length==0){
            return -1;
        }
        int n = arr.length;

        //arr只有一个数 或 arr[0] < arr[1]
        if (n==1 || arr[0] < arr[1]){
            return 0;
        }

        //若 arr[n-1] < arr[n-2]
        if (arr[n-1] < arr[n-2]){
            return n-1;
        }

        int L = 0;
        int R = n-1;
        while (L < R-1){ // 保证够3个数, 因为mid-1和mid+1都在L和R的内部
            int mid = (L+R) / 2;
            //如果 arr[mid-1]>arr[mid]<arr[mid+1] 则返回mid
            if (arr[mid-1]>arr[mid] && arr[mid]<arr[mid+1]){
                return mid;
            }
            // 1. 左 > 我 我 > 右
            // 2. 左 < 我 我 < 右
            // 3. 左 < 我 我 > 右
            // 上述3点可以简略成以下两个情况， 因为只返回一个值就可以

            else{
                //如果arr[mid]>arr[mid-1], 则0～mid-1必然存在局部最小 (砍右边)
                if (arr[mid]>arr[mid-1]){
                    R = mid -1;
                }
                //如果arr[mid]>arr[mid+1], 则mid+1~n-1必然存在局部最小 (砍左边)
                else {
                    L = mid+1;
                }
            }

        }

        return arr[L] < arr[R]? L: R ;

    }









}
