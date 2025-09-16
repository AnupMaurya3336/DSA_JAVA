package Session5_data_type;

public class decimal_to_binary {
    public static void main(String[] args) {
        int num=428;
        int sum=0;
        int mul=1;
        while(num>0){
            int rem=num%2;
            sum=sum+rem*mul;
            mul*=10;
            num/=2;
        }
        System.out.println(sum);
    }
    
}
