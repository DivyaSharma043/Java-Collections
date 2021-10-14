import java.util.*;
public class ArrayListProject {
    public static void main(String[] args) {
        ArrayList<String>names;
        
        names = new ArrayList<>();
        names.add("Divya");
        names.add("Ashish");
        names.add("Shabhnam");
        names.add("Rajesh");
        
        System.out.println("contents of name: "+ names);
        names.add(4,"Shivam");
        System.out.println("contents of name: "+ names);
        
        if(names.contains("Divya"))
            System.out.println("Divya is present in the array list");
        
        ArrayList<Integer>nums;
        nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        
        int sum=0;
        for(int i=0; i<nums.size();i++)
            sum = sum+nums.get(i);
        
        System.out.println("sum= "+ sum);
        
        Integer arr[] = new Integer[nums.size()];
        arr = nums.toArray(arr);
        
        sum=0;
        for(int n: arr)
            sum+=n;
        System.out.println("sum= "+ sum);
    }
}
