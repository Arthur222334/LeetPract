package Arrays.OneD;

public class Ceiling {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9};
        int target = 5;
        int ans = Ceil(array, target);
        System.out.println(ans);
    }

    static int Ceil(int[] array, int target) {
        if (target>array[array.length-1]){
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
        boolean isAsc = array[end] > array[start];
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (target == array[mid]) {
                return mid;
            }
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return array[start];
    }
}
