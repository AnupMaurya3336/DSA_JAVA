package Session15_String_one;

public class compair {
    public static void main(String[] args) {
        String s="anup";
        String a=new String("anup");
        System.out.println(s==a);
        System.out.println(s.charAt(0));
        System.out.println(s.equals(a));
        System.out.println(equal(s, a));
    }
    public static boolean equal(String s,String a){
        if(s==a){
            return true;
        }if(s.length() != a.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != a.charAt(i)){
                return false;
            }
            
        }
        return true;
    }
    
}
