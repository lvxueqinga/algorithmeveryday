package com.lxq.algorithmeveryday;

import com.lxq.algorithmeveryday.utils.Node;

/**
 * 合并两个有序链表 Leetcode25
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/04/14 15:41
 */
public class MergeTwoList {

    public static Node merge(Node head1, Node head2){
        //边界情况， 有一个为空，直接返回另一个
        if (head1==null || head2==null){
            return head1 == null ? head2 : head1;
        }

        Node head = head1.value<head2.value ? head1: head2; // 定义合并后的头节点 （value最小值）
        Node cur1 = head.next; // head后面的节点
        Node cur2 = head==head1? head2 : head1; // 另一个链表的第一个节点
        Node pre = head ;// 用于往后循环

        while (cur1!=null && cur2!=null){
            if (cur1.value < cur2.value){
                pre.next = cur1;
                cur1 = cur1.next;
            }else {
                pre.next = cur2;
                cur2 = cur2.next;
            }
            pre = pre.next;
        }

        pre.next = cur1==null? cur2: cur1;

        return head;

    }


    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(5);
        Node n3 = new Node(6);

        n1.next = n2;
        n2.next = n3;

        Node n4 = new Node(2);
//        Node n5 = new Node(3);
//        Node n6 = new Node(4);

//        n4.next = n5;
//        n5.next = n6;

        n1.print(n1);
        n4.print(n4);
        System.out.println("=====");

        Node newN = merge(n1,n4);
        newN.print(newN);

    }

}
