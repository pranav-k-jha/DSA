package Arrays;

//Method : 1

/*
* Approach 1 (Sum Formula):

Uses arithmetic to compute the missing number by subtracting the sum of the array from the total sum of 
1 to 𝑛
Simple and easy to understand.

 * Approach 2 (XOR Method):
 
XOR is used to find the missing number without requiring arithmetic
operations.
Efficient and avoids integer overflow.

*/

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {

        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }

    public static int findMissingNumberXor(int[] arr, int n) {
        int xorN = 0;
        int xorArr = 0;

        for (int i = 0; i <= n; i++) {
            xorN ^= i;
        }

        for (int num : arr) {
            xorArr ^= num;
        }

        return xorN ^ xorArr;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 1, 2, 3, 5 };
        System.out.println("Missing Number: " + findMissingNumber(arr, n));
        System.out.println("Missing number using XOR: " + findMissingNumberXor(arr, n));

    }
}
