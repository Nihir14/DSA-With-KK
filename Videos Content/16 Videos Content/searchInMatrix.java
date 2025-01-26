import java.util.Arrays;


public class searchInMatrix {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40, 42},
                {15, 25, 35, 45, 46},
                {28, 29, 37, 49},
                {33, 34, 38, 50}};
        int target = 46;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    private static int[] search(int[][] arr, int target) {
        int row = 0;
        int col = arr[row].length - 1;

//        while (row < arr.length && col >= 0) {
//            if (arr[row][col] == target) {
//                return new int[]{row, col};
//            } else if (arr[row][col] < target) {
//                row++;
//            } else {
//                col--;
//            }
//
//        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                } else if (arr[i][j] < target) {
                    break;
                } else {
                    continue;
                }
            }
        }
        return new int[]{-1, -1};
    }
}