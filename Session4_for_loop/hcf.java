package Session4_for_loop;

public class hcf {
    public static void main(String[] args) {
        int divident=60;
        int divisor=36;
        while(divident%divisor!=0){
            int rem=divident%divisor;
            divident=divisor;
            divisor=rem;
           
        }
         System.out.println(divisor);
    }
    pp
}
