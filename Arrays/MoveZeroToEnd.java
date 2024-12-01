package Arrays;

public class MoveZeroToEnd {

    public static void printArrayStatic(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // arr = [0, 1, 0, 2, 1, 0, 3]
    public static int[] moveZeroToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else if (arr[j] != 0) {
                j++;
            }
            ;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] result = moveZeroToEnd(new int[] { 8, 1, 0, 2, 1, 0, 3 });
        printArrayStatic(result);
    }
}
