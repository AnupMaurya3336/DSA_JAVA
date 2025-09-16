package Session5_data_type;

public class binary_to_decimal {
    public static void main(String[] args) {
        int num=101101;
        int sum=0;
        int mul=1;
        while(num>0){
            int rem=num%10;
            sum=sum+rem*mul;
            mul*=2;
            num/=10;
        }
        System.out.println(sum);
    }
    
}
