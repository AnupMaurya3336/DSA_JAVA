package Session11_Binary_Search;
public class Binary_Search {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10,11,12}; 
        int target=8;
        System.out.println(Binary_Searcharr(arr, target));
    }
    public static int Binary_Searcharr(int [] arr,int target){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return -1;
    }
}
