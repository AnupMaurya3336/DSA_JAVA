package Session4_for_loop;

public class fibonaci {
    public static void main(String[] args) {
        int n=6;
        int a=0;
        int b=1;
       
        for(int i=1;i<=n;i++){
            System.out.println(a);  //pura serious ko print kerne ke liye
             int c=a+b;
             a=b;
             b=c;
        }
        System.out.println(a);
    }
    
}
