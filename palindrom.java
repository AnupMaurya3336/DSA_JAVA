package Session15_String_one;

public class palindrom {
    public static void main(String[] args) {
        String s="abcba";
        System.out.println(ispalidrom(s));

    }
    public static boolean ispalidrom(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    
}
