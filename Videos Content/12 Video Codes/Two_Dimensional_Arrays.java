import java.util.Arrays;
import java.util.Scanner;

public class Two_Dimensional_Arrays {
    private static int[][] arr;

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {6, 7, 8, 9},{10, 11, 12, 13,}};


        System.out.println(arr.length);

//        for (int i = 0; i<arr.length; i++) {
//            for (int j = 0; j<arr[i].length; j++) {
//                System.out.println(i + " " + j);
//                arr[i][j] = scn.nextInt();
//            }
//        }

        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j<arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i<arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
