package Session14_2D_Array;

public class Spiral_Matrix_54 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3,123 }, { 4, 5, 6,456 }, { 7, 8, 9 ,789} };
        sprial(arr);

    }

    public static void sprial(int[][] arr) {    /// lekin ye code n*n ke martic ke liye hai n*m ke liye nhi 
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int te=arr.length*arr[0].length;    //n*m kiya gya hai
        int c=0;                                   // ye n*m ke liye ,isi liye count lagaya gya hai  n*n ke liye count ko hata do;
        while (c<te) {      // bara bar isi ko repat krege  

            for (int i = minc; i <= maxc && c<te ; i++) {    //only first row
                System.out.print(arr[minr][i] + " ");
                c++;
            }
            minr++;
            for (int i = minr; i <= maxr && c<te; i++) {    //only col vo bhi last vala
                System.out.print(arr[i][maxc] + " ");
                c++;
            }
            maxc--;
            for (int i = maxc; i >= minc && c<te; i--) {    //only row last vala vo nhi reverse
                System.out.print(arr[maxr][i] + " ");
                c++;
            }
            maxr--;
            for (int i = maxr; i >= minr && c<te; i--) {     // only col first vala vo bhi reverse vala
                System.out.print(arr[i][minc] + " ");
                c++;
            }
            minc++;
        }

    }

}
