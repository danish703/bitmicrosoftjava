
package bitmicrosoft;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> country = new HashSet<>();
        //add item
        country.add("nepal");
        country.add("india");
        country.add("china");
        country.add("nepal");
        country.add("Bhutan");
        country.add("india");
        System.out.println(country);
        //check the data is not in set or not
        System.out.println(country.contains("USA"));
        System.out.println(country.contains("india"));
        
        //removed data from hashset
        country.remove("nepal");
        //country.clear();
        System.out.println(country);
        
        System.out.println(country.size());
        
        for(String c:country){
            System.out.println(c);
        }
        
        
    }
}
