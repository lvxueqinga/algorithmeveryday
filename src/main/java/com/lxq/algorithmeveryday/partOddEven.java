package com.lxq.algorithmeveryday;

/**
 * 一组数据， 奇数放在前面，偶数放在后面
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/06/29 13:37
 */
public class partOddEven {

    public static void part(int [] nums){
        if (nums== null){
         System.out.println( " kong ");
        }

        if (nums.length==1){
            System.out.println(nums[0]);
        }


        int head = 0;
        int tail = nums.length-1;

        while (head<tail){
            while (nums[head] %2 != 0 && head<tail){
                head++;
            }
            while (nums[tail] %2 == 0 && head<tail){
                tail--;
            }
            //交换
            if (head<tail){
                int temp = nums[head];
                nums[head] = nums[tail];
                nums[tail] = temp;
                head ++;
                tail--;
            }
        }

        //输出
        for ( int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + "   ,   ");
        }


    }


    public static void main(String[] args) {
        int [] nums = {1,7,3,4,6,6,6};
        part(nums);
    }
}
