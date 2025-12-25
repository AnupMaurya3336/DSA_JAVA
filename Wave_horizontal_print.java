package Session14_2D_Array;

public class Wave_horizontal_print {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 } };
        wave(arr);

    }

    public static void wave(int [][] arr){
        for (int row = 0; row < arr.length; row++) {
            if(row%2==0){
                for (int col = 0; col < arr[0].length; col++) {
                    System.out.print(arr[row][col]+" "); 
                      
                }
                System.out.println();
            }else{
                for (int col = arr[0].length-1; col >=0; col--) {
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();
            }
            
        }
    }
    
}
