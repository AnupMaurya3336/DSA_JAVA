package Session9_Array_Qps;

public class Rotate_Array_189 {
    public static void main(String [] args){
        int [] arr={1,2,3,4,5,6,7};
        int k=3;
        printRotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void printRev(int [] nums,int i,int j){
        while(i<j){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            i++;
            j--;
        }
    }
    public static void printRotate(int[] nums,int k)  {
        int n = nums.length;
        k %= n;
        if(nums.length==1){
            return; 
        }
        printRev(nums,0,n-1);
        printRev(nums,0,k-1);
        printRev(nums,k,n-1);
    } 
    
}
