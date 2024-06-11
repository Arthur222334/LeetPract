package Arrays.OneD;

public class firstlasto {
    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        int ans = Argo(arr, target);
        System.out.println(ans);
    }
    static int  Argo(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        boolean isAsc = array[start] < array[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == array[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
