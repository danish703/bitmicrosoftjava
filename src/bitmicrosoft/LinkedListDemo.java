package bitmicrosoft;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> language = new LinkedList<>();
        //add data 
        language.add("Java");
        language.add("Python");
        language.add("C");
        language.add("C++");
        language.add("Javascript");
        System.out.println("Linked List="+language);
        //data access
        String c = language.get(4);
        System.out.println(c);
        System.out.println(language.get(2));
        //to set the data 
        language.set(3,"C#");
        System.out.println("Linked List="+language);
        
        //to remove the element
        language.remove(2);
        System.out.println("Linked List="+language);
        
        //person linked list
        LinkedList<Person> p = new LinkedList<>();
        Person x = new Person("ram");
        p.add(x);
        Person y = new Person("sita");
        Person z = new Person("gita");
        p.add(y);
        p.add(z);
        
        //display
        p.get(0).displayname();
    }
    
}
