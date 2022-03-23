package com.company;
import java.util.*;

public class LL2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("Hello");
        list.add("Bete");
        System.out.println(list);

        list.addLast("Kya");
        list.addLast("ho");
        System.out.println(list);

        list.removeLast();
        list.removeFirst();
        System.out.println(list);

        list.remove();
        System.out.println(list);


        list.remove("Kya");
        list.add("Abe");
        System.out.println(list);

        System.out.println(list.size());

    }
}
