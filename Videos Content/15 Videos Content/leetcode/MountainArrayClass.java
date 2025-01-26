package leetcode;

import static leetcode.LeetCode_1095.findInMountainArray;

interface MountainArray {
    public int get(int index);
    public int length();
}

public class MountainArrayClass implements MountainArray {
    int[] arr = {1,2,3,4,5,3,1};
    static int target = 3;


    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int length() {
        return arr.length;
    }

    int length(int[] arr) {
        return arr.length;
    }
    public static void main(String[] args) {
        int ans = findInMountainArray(target, new MountainArrayClass());
        System.out.println(ans);
    }

}
