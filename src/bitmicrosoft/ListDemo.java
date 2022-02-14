
package bitmicrosoft;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList(); 
        mylist.add(12);
        mylist.add(115);
        List<Integer> mylist2 = new ArrayList();  
        mylist2.addAll(mylist);
        System.out.println(mylist);
        System.out.println();
        
    }
}
