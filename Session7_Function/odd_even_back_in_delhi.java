package Session7_Function;

public class odd_even_back_in_delhi {
    public static void main(String[] args) {
       int n=32345;
        // System.out.println(cheack_number(n));
        if(cheack_number(n)==true){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    public static boolean cheack_number(int n){
        int oddsum=0;
        int evensum=0;
        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                evensum+=rem;
            }else{
                oddsum+=rem;
            }
            n=n/10;
        }
        if(evensum%4==0 || oddsum%3==0){
            return true;
        }else{
            return false;
        }

    }
    
}
