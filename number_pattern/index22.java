package number_pattern;
import java.util.*;
public class index22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int n=0;
        int row=1;
        int space=n-1;
        int star=1;
        
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            int val=1;
            while(j<=star){
                System.out.print(val +" ");
                if(j<=star/2){
                    val++;
                }else{
                    val--;
                }
                j++;
                
            }
            row++;
            System.out.println();
            space--;
            star+=2;
            
        }

    }
}
