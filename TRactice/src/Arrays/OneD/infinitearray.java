package Arrays.OneD;

import java.util.Arrays;

public class infinitearray {
    public static void main(String[] args) {
//        start with the size of box 2
        int[ ] array={3,5,7,9,10,90,100};
        int target = 10;
        System.out.println((ans(array,target)));

    }

    static int ans(int[] array, int target) {
//        first find the range
        int start = 0;
        int end = 1;
//        condition for the target to lie in the range
        while (target > array[end]) {
            int newS = end + 1;
//            end = end + (end - start + 1) * 2;
            start = newS;
        }
        return BinarySearch(array,target,start,end);
    }

    static int BinarySearch(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
