package Session7_Function;

public class sim {
     static int val=12;
    public static void main(String[] args) {
        int a=12;
        int b=34;
        System.out.println(val);
        System.out.println("hii"+ (a+b));
        System.out.println(Add());
        System.out.println(val);
    }
    public static int Add(){
        int a=34;
        int b=23;
        int c=a-b;
        val=val+45;
        return c;
    }
    
}
