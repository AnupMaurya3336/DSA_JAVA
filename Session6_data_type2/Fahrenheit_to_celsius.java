package Session6_data_type2;

import java.util.Scanner;

public class  Fahrenheit_to_celsius{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int minf=sc.nextInt();
        int maxf=sc.nextInt();
        int step=sc.nextInt();
        for(int i=minf;i<=maxf;i=i+step){
            int c=(int)((5/9.0)*(i-32));
            System.out.println(i +"\t"+c);
        }
    }
    
}
