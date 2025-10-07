package Session8_Array_Basic;
import java.util.*;
public class Basic1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
           
        }
        Display(arr);
    }
    public static void Display(int [] arr){
        
        System.out.println();
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
            
        }
    }

    
}