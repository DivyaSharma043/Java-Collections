import java.util.*;
public class LinkedListProject {
    public static void main(String[] args) {
        LinkedList<String> L;
        L = new LinkedList<>();
        L.add("Divya");
        L.add("Riya");
        L.add("Rajesh");
        L.add("Ashish");
        L.add("Mayank");
        System.out.println(L);
        
        
        L.set(2,"Shabhnam");
        System.out.println(L);
        
        String name = L.get(2);
        System.out.println("String at position 2= "+ name);
        L.add(3,"Gourav");
        System.out.println(L);
        L.remove(1);
        System.out.println(L);
    }
}
