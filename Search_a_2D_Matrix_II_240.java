package Session14_2D_Array;

public class Search_a_2D_Matrix_II_240 {
    public static void main(String[] args) {
        int [][] arr={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=16;
        System.out.println(search(arr,target));
    }
    public static boolean search(int [][] arr, int item){
        int r=0;
        int c=arr[0].length-1;           //start right upper corner se hoga aur  aur left down se bhi 
                                         //ker sakte hai  kauki row ++ ho rha hai to col-- ho rha hai ydi 
                                         //left up ya right down se start kri to row++ and col++ dono ker hoga ya 
                                         //row-- ya col-- bhi dono sath se kerna hoga jo ki bahit hard hai
        while (r<arr.length && c>=0) {
            if(arr[r][c]==item){
                return true;
            }else if(arr[r][c]>item){
                c--;
            }else{
                r++;
            }
            
        }
        return false;
    }
    
}
