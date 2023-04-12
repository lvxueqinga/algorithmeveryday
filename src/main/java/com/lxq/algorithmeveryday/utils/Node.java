package com.lxq.algorithmeveryday.utils;

/**
 * 单链表节点
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/04/12 19:55
 */
public class Node {
    public Node next;
    public  int value;


    public Node(int value){
        this.value = value;
    }

    // 打印
    public void print(Node head){
        while (head!=null){
            System.out.print(head.value + "  ->  ");
            head = head.next;
        }
        System.out.println(" ");
    }
}
