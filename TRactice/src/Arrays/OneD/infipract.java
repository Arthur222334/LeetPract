package Arrays.OneD;

public class infipract {
    static int ans(int[] array, int target) {
        int start = 0;
        int end = 1;
        while (target > array[end]) { //  end (target) start
            int NewStart = end + 1;
            end = end + (end - start + 1) * 2;  //+1 because array starts form 0th index and *2 because we are multiplying the size of array(reverse binary search)
            start = NewStart;

        }
        return BinarySearch(array, target, start, end);
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
