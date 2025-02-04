package arrays_question;

import java.util.ArrayList;
import java.util.List;

public class linearSearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,43324,2342,134,76,76,76,234232,4};
        int target = 76;
        int index = 0;
        System.out.println(linearSearch(arr, target, index));
        System.out.println(linearSearchIndex(arr, target, index));
        linearSearchAllIndex(arr, target, index);
        System.out.println(arrayList.toString());
    }

    private static boolean linearSearch(int[] arr, int target, int index) {
        if (index > arr.length-1) {
            return false;
        }
        return (arr[index] == target) || linearSearch(arr, target, index+1);
    }

    private static int linearSearchIndex(int[] arr, int target, int index) {
        if (index > arr.length-1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }
        return linearSearchIndex(arr, target, index+1);
    }

    static ArrayList<Integer> arrayList = new ArrayList<>();
    private static void linearSearchAllIndex(int[] arr, int target, int index) {
        if (index > arr.length-1) {
            return;
        }

        if (arr[index] == target) {
            arrayList.add(index);
        }
        linearSearchAllIndex(arr, target, index+1);
    }


}
