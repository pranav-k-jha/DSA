package Arrays;

public class ArrayPrint {

    public void printArrayNonStatic(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArrayStatic(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayPrint arrayPrint = new ArrayPrint();
        arrayPrint.printArrayNonStatic(new int[] { 5, 2, 1, 9, 10 });

        printArrayStatic(new int[] { 5, 2, 1, 9, 10 });

    }

}
