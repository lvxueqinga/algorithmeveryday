package com.lxq.algorithmeveryday;

/**
 * kmp算法
 *
 * @program：algorithmWithJava
 * @author: lvxueqing
 * @create: 2023/04/14 18:43
 */
public class KMP {

    public void getNext(int[] next, String s){
        int j = 0;
        next[0] = j;
        for (int i = 1; i<s.length(); i++){
            while(j>0 && s.charAt(i) != s.charAt(j)){
                j=next[j-1];
            }

            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            next[i] = j;
        }
    }
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }

        int[] next = new int[needle.length()];
        getNext(next, needle);
        int j = 0;
        for(int i = 0; i<haystack.length();i++){
            while(j>0 && haystack.charAt(i) != needle.charAt(j)){
                j = next[j-1];
            }
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
            }
            if(j==needle.length()){
                return (i-needle.length()+1);
            }
        }

        return -1;
    }
}
