package com.lxq.algorithmeveryday.utils;

/**
 * 双链表
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/04/12 19:56
 */
public class DoubleNode {

    public int value;
    public DoubleNode next;
    public DoubleNode last;

    public DoubleNode(int value){
        this.value = value;
    }

    // 打印
    public void print(DoubleNode head){
        while (head!=null){
            System.out.print(head.value + "  ->  ");
            head = head.next;
        }
        System.out.println(" ");
    }

}
