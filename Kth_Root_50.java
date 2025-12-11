package Session11_Binary_Search;

public class Kth_Root_50 {
    public static void main(String[] args) {
        int n=143;
        int k=3;
        System.out.println(Kthroot(n, k));
    }
    public static int Kthroot(int n, int k){
        int lo=1;
        int hi=n;
        int ans=0;
        while (lo<=hi) {
            int mid=lo+(hi-lo)/2;
            if(Math.pow(mid, k)<=n){
                ans=mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return ans;
    }
    
}
