package Session15_String_one;

import java.util.Scanner;

public class Reverse_Words_inString151 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s="anup maurya a name";
        System.out.println(reveString(s));
        
    }
    public static String reveString(String s){
        s=s.trim();  //aage piche se space ko remove ker deta hai
        String [] arr=s.split("\s+");
        String ans="";
        for (int i = arr.length-1; i >=0; i--) {
            ans=ans+arr[i] +" ";            
        }
        return ans.trim();
    }
    
}
