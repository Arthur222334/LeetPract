package Arrays.OneD;

public class Ract {
    static int[] search(int[] array, int target) {
        int[] ans = {-1, -1};
        ans[0] = Ans(array, target, true);
        ans[1] = Ans(array, target, false);
        return ans;
    }

    static int Ans(int[] array, int target, boolean FindTheIndex) {
        int ans = 0;
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (FindTheIndex) {
                    end = mid - 1; //first occurrence = target<array[mid] start( mid )
                } else {
                    start = mid + 1;//last occurrence = target>array[mid] ( mid )end
                }
            }
        }
        return ans;
    }
}
