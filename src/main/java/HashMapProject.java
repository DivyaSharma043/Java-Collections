import java.util.*;
public class HashMapProject {
    public static void main(String[] args) {
        
        HashMap<String, String> h;
        h = new HashMap<>();
        
        h.put("Sunday", "Ravivar");
        h.put("Monday", "Somvar");
        h.put("Tuesday", "Mangalvar");
        h.put("Wednesday", "Bhudhvar");
        h.put("Thursday", "Veervar");
        h.put("Friday", "Shukarvar");
        h.put("Saturday", "Shanivar");
        
        System.out.println(h);
        
        String str;
        str = h.get("Wednesday");
        System.out.println("Wednesday in hindi is: "+str);
        
    }
}
