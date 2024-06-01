package Arrays.OneD;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int ans  = Lino(arr,6);
        System.out.println(ans);
    }
    static int Lino(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }
        for (int row = 0; row < array.length; row++) {
            int element = array[row];
            if (element == target) {
                return row;
            }
        }
        return -1;
    }
}
