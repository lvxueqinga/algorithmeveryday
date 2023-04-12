package com.lxq.algorithmeveryday;

import com.lxq.algorithmeveryday.utils.Node;

/**
 * 单链表实现队列
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/04/12 21:22
 */
public class NodeToQueue {

    int size ;
    Node head;
    Node tail;

    //初始化队列
    public NodeToQueue(){
        size = 0;
        head = null;
        tail = null;
    }

    //队列是否为空
    public boolean isEmpty(){
        return size==0;
    }

    //队列长度
    public int getQueueLen(){
        return size;
    }

    //元素入队
    public void offer(int value){
        Node node = new Node(value);
        //如果当前队列是空的
        if(tail==null){
            head = node;
            tail = node;
        }else {
            //否则
            tail.next = node;
            tail = node;

        }
        size++;
    }

    //队头元素出队
    public Integer pool(){
        Integer ans = null;

        if (head!=null){
            ans = head.value;
            head = head.next;
            size--;
        }

        if (head==null){
            tail = null;
        }

        return ans;
    }

    //获取队头元素值
    public Integer peek(){
        if (head!=null){
            return head.value;
        }else {
            return null;
        }

    }

    //打印队列
    public void print(){
        Node curr = head;
        while (curr!=null){
            System.out.print(curr.value + "  ->  ");
            curr = curr.next;
        }
        System.out.println(" ");
    }





    public static void main(String[] args) {
        NodeToQueue queue = new NodeToQueue();

        System.out.println(" 是否为空 "+queue.isEmpty());
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(" 是否为空 "+queue.isEmpty());
        queue.print();
        System.out.println(" 当前长度 "+queue.getQueueLen());

        System.out.println(" 头节点是 "+queue.peek());


        queue.pool();
        queue.print();
        System.out.println(" 当前长度 "+queue.getQueueLen());

        System.out.println(" 头节点是 "+queue.peek());


    }
}
