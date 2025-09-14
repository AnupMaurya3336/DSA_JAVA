package Session4_for_loop;

import java.util.*;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count>=1){
            System.out.println("not prime");
        }else{
            System.out.println("yes prime");
        }
        
    }
    
}
