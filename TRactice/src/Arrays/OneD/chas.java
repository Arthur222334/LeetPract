package Arrays.OneD;

public class chas {
    static int Ceil(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (end > start) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.gc();
        return letters[start % letters.length];
    }
}
