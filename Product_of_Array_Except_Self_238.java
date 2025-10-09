package Session9_Array_Qps;

public class Product_of_Array_Except_Self_238 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int [] ans=Array_Except_selfe(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        
    }
    public static int [] Array_Except_selfe(int [] arr){
        int n=arr.length;
        int [] left=new int[n];
        left[0]=1;
        for (int i = 1; i < left.length; i++) {
            left[i]=left[i-1]*arr[i-1];
        }
        int [] rigth=new int[n];
        rigth[n-1]=1;
        for (int i = n-2; i>=0; i--) {
            rigth[i]=rigth[i+1]*arr[i+1];
        }
        for (int j = 0; j < rigth.length; j++) {
            left[j]=left[j]*rigth[j];
        }
        return left;
        
    }
    
}
