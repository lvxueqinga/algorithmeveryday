package com.lxq.algorithmeveryday;

import com.lxq.algorithmeveryday.utils.Node;

/**
 * 两个链表相加
 *
 * 例子 4 -> 3 -> 6  2 -> 5 -> 3
 * 返回 6 -> 8 -> 9
 * 634+352=986
 *
 * 不新建链表 ， 在较长的链表上更新并返回
 *
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/04/14 14:31
 */
public class AddTwoNodeList {

    //获取长度
    public static int getLength(Node head){
        int len = 0;
        while (head!=null){
            head = head.next;
            len++;
        }
        return len;
    }

    public static Node addTwoNum(Node head1, Node head2){
        int len1 = getLength(head1);
        int len2 = getLength(head2);

        //先分出长短
        Node l = len1 > len2 ? head1 : head2;
        Node s = l ==head1 ? head2: head1;

        int carry = 0; // 进位判断
        int curNum = 0; // 当前长+短+进位的和
        Node last = null; // 记录最后一个节点
        Node nodeL = l; // 用来往后循环
        Node nodeS = s;

        //长有 短有
        while (nodeS!=null){

            curNum =nodeL.value + nodeS.value + carry; // 计算当前和
            nodeL.value = curNum % 10; //修改长链表节点的值
            carry = curNum / 10; // 记录进位
            last = nodeL; // 更新最后一个节点
            nodeL = nodeL.next; //指针后移
            nodeS = nodeS.next;
        }


        //长有 短没有
        while (nodeL != null){
            curNum =nodeL.value  + carry; // 计算当前和
            nodeL.value = curNum % 10; //修改长链表节点的值
            carry = curNum / 10; // 记录进位
            last = nodeL; // 更新最后一个节点
            nodeL = nodeL.next; //指针后移

        }

        //长没有，是否需要进位
        if(carry == 1){
            Node newNode = new Node(1);
            last.next = newNode;
        }

        return l;



    }

    public static void main(String[] args) {

        Node n1 = new Node(4);
        Node n2 = new Node(3);
        Node n3 = new Node(6);

        n1.next = n2;
        n2.next = n3;

        Node n4 = new Node(9);
        Node n5 = new Node(5);
        Node n6 = new Node(4);

        n4.next = n5;
        n5.next = n6;

        n1.print(n1);
        n4.print(n4);
        System.out.println("=====");

        Node newN = addTwoNum(n1,n4);
        newN.print(newN);




    }
}
