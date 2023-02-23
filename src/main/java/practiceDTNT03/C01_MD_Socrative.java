package practiceDTNT03;

import java.util.Arrays;

public class C01_MD_Socrative {
    public static void main(String[] args) {
        int arr[][] = {{3, 2, 1}, {1, 2, 3}};

        for (int i = 1; i < 2; i++) {// 1,2
            System.out.println(Arrays.deepToString(arr)); // [[3, 2, 1], [1, 2, 3]]
            for (int k = 1; k < arr[0].length; k++) {
                if (arr[i][k] % 2 == 1) {  //
                    arr[i][k] = arr[i][k] + 1;
                }
                if (arr[i][k] % 2 == 0) {
                    arr[i][k] = arr[i][k] * 2;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr)); // [[3, 2, 1], [1, 4, 8]]

        int brr[][] = {{5, 12}, {3, 8, 4}, {6, 3}};

        System.out.println(m(arr));


    }


    public static int m(int[][] brr) {

        int r, c;

        int i, k = 0;


        for (r = 0; r < brr.length; r++) {

            for (c = 0; c < brr[0].length; c++) {

                i = brr[r][c];

                if (i > k)

                    k = i;

            }

        }

        return k; // 8


    }
}
