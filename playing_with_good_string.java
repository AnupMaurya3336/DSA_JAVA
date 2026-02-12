package Session15_String_one;

public class playing_with_good_string {
    public static void main(String[] args) {
        String s="cbaeicde";
        System.out.println(long_String(s));

    }public static int long_String(String s){
        int ans=0;
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(isvovel(ch) == true){
                count++;
            }else{
                ans=Math.max(ans, count);
                count=0;
            }   
        }
        ans=Math.max(ans, count);
        return ans;
    }
    public static boolean isvovel(char ch){
        if(ch=='a' || ch =='e' || ch=='i' || ch =='o' || ch=='u'){
            return true;
        }
        return false;
    }
    
}