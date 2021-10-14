import java.util.*;
public class TreeProject {
    public static void main(String[] args) {
        
        TreeSet<Integer>ts;
        ts = new TreeSet<>();
        
        ts.add(20);
        ts.add(17);
        ts.add(6);
        ts.add(8);
        ts.add(10);
        ts.add(7);
        ts.add(18);
        ts.add(13);
        ts.add(12);
        ts.add(5);
        
        System.out.println(ts);
        System.out.println(ts.subSet(6,17));
        ts.remove(18);
        System.out.println(ts);
        ts.add(16);
        System.out.println(ts);
        System.out.println("Size of tree: "+ts.size());
        ts.clear();
        System.out.println(ts);
        
    }
}
