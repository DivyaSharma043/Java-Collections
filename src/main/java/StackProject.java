import java.util.*;
public class StackProject {
    
    public static void main(String[] args) {
        
        Stack<String> s;
        s = new Stack<>();
        s.push("Delhi");
        s.push("Ludhiana");
        s.push("Chandigarh");
        s.push("Himachal");
        s.push("Kharar");
        
        String str;
        
        /*if(!s.isEmpty())
        {
            str = s.pop();
            str = s.pop();
            System.out.println(str);
        }
        
        if(!s.isEmpty())
        {
            str = s.pop();
            System.out.println(str);
        }*/
        
        while(!s.isEmpty())
        {
            str = s.pop();
            System.out.println(str);
        }
    }
}
