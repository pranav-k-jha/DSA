package Arrays;

public class MinArray {

    public int findMinimum(int[] arr) {
        // edge cases
        if (arr.length == 0 | arr == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 9, 3, 15, 0, 2 };
        MinArray ma = new MinArray();

        System.out.println(ma.findMinimum(arr));
    }
}
