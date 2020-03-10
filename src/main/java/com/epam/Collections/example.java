package com.epam.Collections;

public class example {
	public static void main(String args[]) {

	ArrayListCustom<String> list=new ArrayListCustom<String>();
	list.add("Maps");
    list.add("HashMap");
    list.add("List");
    list.add("Linkedlists");
    list.add("ArrayLists");
    list.add("Sets");
    list.add("Hashset");
    
    System.out.println("Intial size :"+ list.initial_size);
    
    System.out.println("Print the elements:");
    list.print();
    System.out.println();
      
    System.out.println("Fetch an element by index: "+list.fetch(4));
    System.out.println();
    
    System.out.println("Adding Elements");
    list.add("Trees");
    list.add("Graphs");
       
    System.out.println("Printing the elements");
    list.print();
    System.out.println();

    
    System.out.println("Removing elements");
    list.remove(2);
    
    System.out.println("Printing elements after deletion");
    list.print();
    
    
	}   

}


