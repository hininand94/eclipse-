package linkedlist;

public class Linkedlist 

import java.util.LinkedList;
 public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Linked List: " + list);

        list.remove("Banana");

        System.out.println("After Removing: " + list);
    }

