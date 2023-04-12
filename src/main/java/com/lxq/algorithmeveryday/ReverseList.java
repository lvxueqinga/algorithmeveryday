package com.lxq.algorithmeveryday;

import com.lxq.algorithmeveryday.utils.DoubleNode;
import com.lxq.algorithmeveryday.utils.Node;

/**
 * 反转单/双链表
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/04/12 19:58
 */
public class ReverseList {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node head = n1;

        head.print(head);
        head.print(reverselist_node(head));




        DoubleNode a = new DoubleNode(1);
        DoubleNode b = new DoubleNode(2);
        DoubleNode c = new DoubleNode(3);
        DoubleNode d = new DoubleNode(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;

        a.last = null;
        b.last = a;
        c.last = b;
        d.last = c;

        DoubleNode head1 = a;
        head1.print(head1);
        head1.print(reverselist_double(head1));


    }

    //单链表反转
    public static Node reverselist_node(Node head){
        Node pre = null;
        Node next = null;

        while (head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head=next;
        }
        return pre;

    }


    //双链表反转
    public static DoubleNode reverselist_double(DoubleNode head){
        // 1）初始化
        DoubleNode pre = null;
        DoubleNode next = null;

        while (head!=null){
            next = head.next;

            // 2）反转
            head.next = pre;
            head.last = next;

            // 3）移动标记
            pre = head;
            head = next;
        }

        return pre;

    }


}
