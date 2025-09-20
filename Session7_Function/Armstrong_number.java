package Session7_Function;

public class Armstrong_number {
    public static void main(String[] args) {
        int n=371;
        System.out.println(Armstrong_num(n));
    }

        public static boolean Armstrong_num(int n){
            int c=digit(n);
            int sum=0;
            int num=n;          /// age value change ho rhi thi 
            while(n>0){
                int rem=n%10;
                sum=(int)(sum +Math.pow(rem,c));
                n/=10;
            }
            if(sum==num){
                return true;
            }else{
                return false;
            }
        }
        
        public static int digit(int n){
            int count=0;
            while(n>0){
                count++;
                n=n/10;
            }
            return count;
        }

    

}
