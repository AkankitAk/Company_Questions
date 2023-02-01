package iMochaTechnologies;
/*
    Find the sum of prime numbers in a given range

    Question link: https://www.geeksforgeeks.org/sum-of-all-the-prime-numbers-in-a-given-range/

    Input : l=1 and r=6
    Output : 10
    Explanation 2+3+5=10
    
    Input : l=4 and r=13
    Output : 36
    Explanation 5+7+11+13=36
 */

public class Question_1 {
    static boolean checkPrime(int num) {
        if (num == 1)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static int sumOfPrime(int a, int b) {
        int primeSum = 0;
        for (int i = a; i <= b; i++) {
            boolean check = checkPrime(i);
            if (check)
                primeSum += i;
        }
        return primeSum;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 13;
        int sum = sumOfPrime(a, b);
        System.out.println(sum);
    }

}
