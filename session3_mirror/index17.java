package session3_mirror;

import java.util.Scanner;

public class index17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=-1;
        int star=n/2+1;
        while (row<=n) {
            int i=1;
            if(row==n || row==1){
                i=2;
            }
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            while (k<=star) {
                System.out.print("* ");
                k++;
            }
            if(row<n/2+1){
                space+=2;
                star--;
            }else{
                space-=2;
                star++;
            }
            row++;
            System.out.println();
            
        }
    }
    
}
