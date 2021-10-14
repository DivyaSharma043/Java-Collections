import java.util.*;
public class ArraysProject {
    public static void main(String[] args) {
        
        int arr[] = new int[5];
        Random r = new Random();
        
        for(int i =0; i<arr.length; i++)
        {
            arr[i]=r.nextInt(25);
            System.out.println(arr[i]);
        }
        
        Arrays.sort(arr);
        System.out.println("After Sorting: ");
        for(int i =0; i<arr.length; i++)
            System.out.println(arr[i]);
       
        Arrays.fill(arr,2,4,-3);
        System.out.println("After Filling: ");
        for(int i =0; i<arr.length;i++)
            System.out.println(arr[i]);
      
        int pos;
        pos = Arrays.binarySearch(arr,-3);
        System.out.println("pos= "+pos);
        
        
    }
}
