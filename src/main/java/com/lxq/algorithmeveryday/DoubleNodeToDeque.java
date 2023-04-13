package com.lxq.algorithmeveryday;

import com.lxq.algorithmeveryday.utils.DoubleNode;

/**
 * 双链表实现双端队列 （头进头出尾进尾出）
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/04/13 17:50
 */
public class DoubleNodeToDeque {

    DoubleNode head;
    DoubleNode tail;
    int size;

    //初始化
    public DoubleNodeToDeque(){
        head = null;
        tail = null;
        size = 0;
    }

    //判断是否为空
    public Boolean idEmpty(){
        return size==0;
    }

    //判断队列长度
    public int getSize(){
        return size;
    }

    //头进 (空的时候 除了要关注head 也要关注tail)
    public void headoffer(int value){
        DoubleNode node = new DoubleNode(value);
        if (head==null){
            head = node;
            tail = node;
        }else {
            node.next = head; // 连
            head.last = node; // 连
            head = node; // 移动head
        }

        size++;
    }

    //头出
    public void headpoll(){
        if (head!=null){
            System.out.println(head.value +" 出栈");
            if (head==tail){ // 边界条件只剩一个元素
                head=null;
                tail=null;
            }else {
                head = head.next;
                head.last = null;
            }

            size--;
        }else {
            System.out.println(" 无元素出栈");
        }

    }

    //尾进
    public void tailoffer(int value){
        DoubleNode node = new DoubleNode(value);
        if (head==null){
            head = node;
            tail = node;
        }else {
            tail.next = node;// 连
            node.last = tail;// 连
            tail = node;// 移动tail
        }
        size++;

    }

    //尾出
    public void tailpoll(){
        if (head!=null){
            System.out.println(tail.value +" 出栈");
            if (head==tail){ // 边界条件只剩一个元素
                head=null;
                tail=null;
            }else {
                tail = tail.last;
                tail.next = null;
            }
            size--;
        }else {
            System.out.println(" 无元素出栈");

        }


    }

    //打印
    public void print(){
        DoubleNode curr = head;
        while (curr!=null){
            System.out.print(curr.value + "  ->  ");
            curr = curr.next;
        }
        System.out.println(" == ");
    }


    public static void main(String[] args) {
        DoubleNodeToDeque deque = new DoubleNodeToDeque();
        deque.headoffer(1);
        deque.headoffer(2);
        deque.print();
        deque.tailoffer(3);
        deque.tailoffer(4);
        deque.print();

        deque.tailpoll();
        deque.print();

    }
}
