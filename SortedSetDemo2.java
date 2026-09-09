package Linkedlist;
import java.util.TreeSet;
public class SortedSetDemo2 {
	

	
	    public static void main(String[] args) {
	        TreeSet<String> set = new TreeSet<>();

	        set.add("Mango");
	        set.add("Apple");
	        set.add("Orange");

	        set.remove("Apple");

	        System.out.println(set);
	    }
	}

