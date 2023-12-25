package com.lxq.algorithmeveryday;

import java.util.ArrayList;
import java.util.List;

/**
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/12/05 21:39
 */
public class quick {

    public static void quickSortSmalltoBig(List<Integer> arr, int start, int end){
        if (start>=end){
            return;
        }
        int i = start;
        int j = end;
        int base = arr.get((start+end)/2);
        while (i<=j){
            while (i<=j && arr.get(i)<base){
                i++;
            }
            while (i<=j && arr.get(j)>base){
                j--;
            }
            if (i<=j){
                int temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
                i++;
                j--;
            }
        }
        quickSortSmalltoBig(arr,start,j);
        quickSortSmalltoBig(arr,i,end);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(7);
        arr.add(3);
        arr.add(9);
        arr.add(2);
        arr.add(3);
        arr.add(6);
        quickSortSmalltoBig(arr,0,5);
        System.out.println(arr.toString());
    }
}
