package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ttt {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        //list.forEach(item -> System.out.println(item*item));
        //list.forEach(ttt::sum1);
        //System.out.println(list);

        String[] words={"Di","B","Aii"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        Arrays.sort(words,(s1,s2)->Integer.compare(s1.length(),s2.length()));
        System.out.println(Arrays.toString(words));
    }

    public static void sum1(int item){
        System.out.println(item+1);

    }
}
