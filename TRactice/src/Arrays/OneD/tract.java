package Arrays.OneD;

import java.util.Arrays;

public class tract {


    public static void main(String[] args) {
        int[] array = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = apple(array, target);
        System.out.println(Arrays.toString(ans));
    }

    static public int[] apple(int[] array, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(array, target, true);
        ans[1] = search(array, target, false);
        return ans;
    }

    static int search(int[] nums, int target, boolean FindtheFirstIndex) {
        int ans = 0;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (FindtheFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
