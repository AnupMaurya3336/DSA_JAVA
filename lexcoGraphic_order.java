package Session15_String_one;

public class lexcoGraphic_order {
    public static void main(String[] args) {
        String s1="komal";
        String s2="kunal";
        System.out.println(s1.compareTo(s2));
        System.out.println(compareTo(s1, s2));
    }
    public static int compareTo( String s1, String s2){   // me mai prebuilt method banata hai (s1.compareTo(s2)); ko
        if(s1==s2){
            return 0;
        }
        int len=Math.min(s1.length(),s2.length());
        for (int i = 0; i < len; i++) {
            if(s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i)-s2.charAt(i);
            } 
        }
        return s1.length()-s2.length();
    }
    
}
