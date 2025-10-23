package Session10_sorting_and_Kadanes;

public class kadanes_Algo {
    public static void main(String[] args) {
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Maxsum(arr));

    }
     public static int Maxsum(int [] arr ){
        int ans=Integer.MIN_VALUE;
            int sum=0;
            for (int j = 0; j < arr.length; j++) {
                sum=sum+arr[j];
                ans=Math.max(ans, sum);
                if(sum<0){                // jab sara value 0 ya negative ho jay to sum ko 0 ker ke uske aage se add kro
                    sum=0;
                }
            }
        return ans;
    }
    
}
