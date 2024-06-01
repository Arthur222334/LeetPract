package TwoD;

import java.util.Arrays;

public class TwoDLinearSearch {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int target = 7;
        System.out.println(Arrays.toString(arr(array,target)));
    }

    static int[] arr(int[][] array, int target) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                int element = array[row][col];
                if (element == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, 1};
    }
}
