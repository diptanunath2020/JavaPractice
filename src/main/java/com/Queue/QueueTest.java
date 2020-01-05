package com.Queue;

public class QueueTest {

    public static void main(String[] args) {

        BasicQueue<String> q=new BasicQueue<>();
        q.enQueue("Diptanu");
        q.enQueue("Nath");
        System.out.println(q.contains("Diptanu"));
        System.out.println(q.size());
        System.out.println(q.access(0));
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());


        System.out.println(q.toString());
    }
}
