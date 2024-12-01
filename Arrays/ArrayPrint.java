package Arrays;

public class ArrayPrint {

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        ArrayPrint arrayPrint = new ArrayPrint();
        arrayPrint.printArray(new int[] { 5, 2, 1, 9, 10 });

    }
}
