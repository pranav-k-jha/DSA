package Arrays;

public class ArrayUtil {
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public void arrayDemo() {
        int[] myArray = new int[5];
        myArray[0] = 2;
        myArray[4] = 4;
        printArray(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length - 1]);

        int[] arr = { 1, 8, 4, 10, 4 };
        printArray(arr);
    }

    public static void main(String[] args) {
        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.arrayDemo();

    }
}