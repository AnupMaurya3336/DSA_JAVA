package Session8_Array_Basic;

public class max_value {
    public static void main(String[] args) {
        int [] arr={3,5,1,7,8,0};
        System.out.println(max_value(arr));
    }
    public static int max_value(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    } 
    
}
