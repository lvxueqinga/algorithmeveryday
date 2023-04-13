package com.lxq.algorithmeveryday;

import com.lxq.algorithmeveryday.utils.Node;

/**
 * 单链表实现栈
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/04/13 17:31
 */
public class NodeToStack {

    int size ;
    Node head ;

    //初始化
    public NodeToStack(){
        size=0;
        head=null;
    }
    //是否为空
    public boolean isEmpty(){
        return size==0;
    }

    //长度
    public int getStackLen(){
        return size;
    }

    //入栈
    public  void push(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }

    //栈顶元素出栈
    public void pop(){
        if (head!=null){
            System.out.println(head.value +" 出栈");
            head = head.next;
            size--;
        }else {

            System.out.println(" 栈空 ");

        }

    }

    //打印栈元素
    public void print(){
        Node curr = head;
        while (curr!=null){
            System.out.print(curr.value + "  ->  ");
            curr = curr.next;
        }
        System.out.println(" == ");
    }


    public static void main(String[] args) {
        NodeToStack stack = new NodeToStack();
        stack.push(1);

        stack.print();

    }

}
