package Session4_for_loop;

public class Sum_of_number {
    public static void main(String[] args) {
        int n=12345;
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans +=rem;
            n /= 10;
        }
        System.out.println(ans);
    }
    
}
