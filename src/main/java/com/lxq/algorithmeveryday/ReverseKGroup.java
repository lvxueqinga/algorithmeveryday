package com.lxq.algorithmeveryday;

import com.lxq.algorithmeveryday.utils.Node;

/**
 * K 个一组翻转链表, leetcode25
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/04/13 19:16
 */
public class ReverseKGroup {



    public static Node reverseKGroup(Node head, int k) {
        // 找第一组， 看是否满足k个
        Node start = head;
        Node end = getKGroupEnd(start,k);
        if (end==null){
            return head;
        }


        // 反转后， 整个链表的新头部 = end
        head = end;
        //第一部分局部反转
        reverse(start,end);
        //上一组的结尾Lastend
        Node lastend = start;
        while (lastend.next!=null){
            start = lastend.next;
            end = getKGroupEnd(start,k);
            if (end==null){
                return head;
            }
            reverse(start,end);

            //当前头和上一组的结尾连接
            lastend.next = end;
            //记录本组的结尾
            lastend = start;

        }
        return head;

    }


    //分组， 找到start开头的，k个之后的那个节点
    public static Node getKGroupEnd(Node head, int k){
        while (--k!=0 && head!=null){
            head = head.next;
        }
        return head;
    }

    //局部反转
    public static  void reverse(Node start, Node end){
        Node pre = null;
        Node next = null;
        Node curr = start;

        end = end.next ; // end后移， 之前的都要反转
        while (curr!=end){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        start.next = end; // 和后面连接

    }


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
        Node anew = n1;
        anew.print(anew);
        anew = reverseKGroup(n1,5);
        anew.print(anew);

    }
}
