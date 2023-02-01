package MountBlue_Technologies;

import java.util.Scanner;

/*
    Question :- Given an array A[] of n elements filled with several integers,
    some of them being zeroes, you need to move all the zeroes to the end.

    Eg:- Input: A[] = {1, 8, 3, 0, 2, 0, 1, 10, 13, 0}
    Output: {1, 8, 3, 2, 1, 10, 13, 0, 0, 0}

    https://afteracademy.com/blog/move-all-the-zeroes-to-the-end/
 */
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                arr1[j++] = arr[i];
        }
        for (Integer e : arr1)
            System.out.print(e + " ");
    }
}
