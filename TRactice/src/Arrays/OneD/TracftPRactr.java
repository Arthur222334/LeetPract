package Arrays.OneD;

public class TracftPRactr {
    int[] searchRange(int[] num, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(num, target, true);
        if (ans[0] != -1) {
            ans[1] = search(num, target, false);
        }
        return ans;
    }

    int search(int[] nums, int target, boolean FindTheindex) {
        int ans = 0;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (FindTheindex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}