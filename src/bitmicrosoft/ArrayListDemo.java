
package bitmicrosoft;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> programmingLanguage = new ArrayList<>(); // array list create
        programmingLanguage.add("Java");
        programmingLanguage.add("Python");
        programmingLanguage.add("Swift");
        System.out.println("Array List"+programmingLanguage);
        
        System.out.println(programmingLanguage.get(1));
        programmingLanguage.set(2,"Javascript");
        System.out.println("Array List"+programmingLanguage);
        
        programmingLanguage.remove(1);
        System.out.println("Array List"+programmingLanguage);
        
        ArrayList<Integer> numarrays = new ArrayList<>();
        numarrays.add(12);
        numarrays.add(4);
        numarrays.add(5);
        numarrays.add(7);
        numarrays.add(8);
        numarrays.add(3);
        System.out.println(numarrays);
        numarrays.removeAll(numarrays);
        System.out.println(numarrays);
    }
    
}
