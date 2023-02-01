package iMochaTechnologies;

/* 
    For the given array of integers, count even and odd elements.

    Question Link: https://www.geeksforgeeks.org/count-number-even-odd-elements-array/

    Examples: 

    Input: 
    int arr[5] = {2, 3, 4, 5, 6}
    Output: 
    Number of even elements = 3    
    Number of odd elements = 2  

    Input:
    int arr[5] = {22, 32, 42, 52, 62}
    Output: 
    Number of even elements = 5  
    Number of odd elements = 0
    
*/

public class Question_2 {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 4, 5, 7, 8, 2 };
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of Even element =" + even);
        System.out.println("Number of Odd element =" + odd);
    }
}
