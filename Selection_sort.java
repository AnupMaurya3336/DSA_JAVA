package Session10_sorting_and_Kadanes;

public class Selection_sort {
    public static void main(String[] args) {
        int [] arr={4,5,3,2,1};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int idx= minidx(arr, i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
        
    }
    public static int minidx(int [] arr, int i){
        int mini=i;
        for (int j = i+1; j < arr.length; j++) {
            if(arr[j]<arr[mini]){
                mini=j;
            }
        }
        return mini;
    }
    
}
