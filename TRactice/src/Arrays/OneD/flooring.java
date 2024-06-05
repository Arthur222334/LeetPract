package Arrays.OneD;

public class flooring {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 7, 8, 9};
        int target = 6;
        int ans = floor(array,target);
        System.out.println(ans);
    }

    static int floor(int[] array, int target) {
        if (target<array[array.length-1]){
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
