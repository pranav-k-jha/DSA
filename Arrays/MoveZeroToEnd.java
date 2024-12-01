package Arrays;

public class MoveZeroToEnd {

    public void printArrayNonStatic(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println();
    }

    // arr = [0, 1, 0, 2, 1, 0, 3]
    public void moveZeroToEnd(int[] arr, int n) {
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
    }

    public void arrayDemo() {
        int[] arr = { 8, 1, 0, 2, 1, 0, 3 };
        printArrayNonStatic(arr);
        moveZeroToEnd(arr, arr.length);
        printArrayNonStatic(arr);
    }

    public static void main(String[] args) {
        // int[] result = moveZeroToEnd(new int[] { 8, 1, 0, 2, 1, 0, 3 });
        // printArrayStatic(result);
        MoveZeroToEnd moveZeroToEnd = new MoveZeroToEnd();
        moveZeroToEnd.arrayDemo();
    }

}
