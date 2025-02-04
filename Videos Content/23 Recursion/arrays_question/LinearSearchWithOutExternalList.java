package arrays_question;

import java.util.ArrayList;

public class LinearSearchWithOutExternalList {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,221,32,221,345,223224,4343,322};
        int target = 221;

        System.out.println(linearSearchWithOutExternalList(arr, target, 0));
    }

    private static ArrayList<Integer> linearSearchWithOutExternalList(int[] arr, int target, int index) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (index > arr.length-1) {
            return new ArrayList<>();
        }
        if (arr[index] == target) {
            ans.add(index);
        }
        ArrayList<Integer> fromBelow = linearSearchWithOutExternalList(arr, target, index+1);
        ans.addAll(fromBelow);
        return ans;
    }


}

