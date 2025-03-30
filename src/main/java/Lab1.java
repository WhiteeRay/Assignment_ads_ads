

import java.util.ArrayList;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> letter = new ArrayList<>();


        System.out.println(isAllDigits("123456", 0));
        System.out.println(binomialCoefficient(2, 1));

        System.out.println(GCD(32, 48));
        stringMingling("abcde", "pqrst", 0);
        for (int i = 0; i < n; i++){
            letter.add(i, sc.next());
        }
        for(String let : letter){
            System.out.println(findSequenceFullOfColors(let,0,0,0,0,0));
        }
        sc.close();
        System.out.println(findGcd(36,48));


    }
    /*
      Finds the minimum element in the given array.
      @param n   the size of the array
      @param arr the array containing elements
      @return the minimum element in the array
      Time Complexity: O(n) (Linear Time Complexity),
      as we iterate through the array once.
     */

    public static int findMinimumOfTheArray(int n, int[] arr) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    /*
      Calculates the average of an array
      @param n   the size of the array
      @param arr the array containing elements
      @return the average value as a double
      Time Complexity: O(n), (Linear Time Complexity)
      as we iterate through the array once to calculate the sum.
     */
    public static double findAverageOfAnArray(int n, int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / n;
    }

    /**
     * Checks if a number is prime.
     *
     * @param num the number to check
     * @return true if the number is prime, otherwise false
     * Time Complexity: O(√n) (Sublinear Time Complexity),
     * since we check divisibility up to sqrt(n).
     */

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }


    /*
     Recursively calculates the factorial of a number.
     @param n the number to compute factorial for
     @return n! (factorial of n)
     Time Complexity: O(n) (Linear Time Complexity),
     as the function calls itself n times.
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    /**
     * Recursively calculates the nth Fibonacci number.
     * Time Complexity: O(2^n) (Exponential Time Complexity),
     * as each call branches into two more recursive calls.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The nth Fibonacci number.
     */
    public static int calculateFib(int n) {
        if (n == 0 || n == 1) return n;
        return calculateFib(n - 1) + calculateFib(n - 2);
    }


    public static int findPowerOfNum(int n, int p) {
        // Base case: Any number raised to the power of 0 is 1
        // Time Complexity: O(1) (constant time for base case)
        if (p == 0) return 1;

        // Base case: Any number raised to the power of 0 is 1
        // Time Complexity: O(1) (constant time for base case)
        if (p == 1) return n;

        // Recursive case: Multiply 'n' by the result of findPowerOfNum(n, p-1)
        // Time Complexity: O(p) (linear time complexity)
        return n * findPowerOfNum(n, p - 1);

    }

    /*
     Recursively prints numbers in reverse order.
     @param n the number of elements to read and print
     @param sc the Scanner object for reading input
     Time Complexity: O(n) (Linear Time Complexity),
     as the function calls itself n times.
     Space Complexity: O(n) (Recursive Call Stack),
     since each function call is stored until it returns.
    */
    public static void printReverseOrder(int n, Scanner sc) {
        if (n == 0) return;
        int num = sc.nextInt();
        printReverseOrder(n - 1, sc);
        System.out.print(num + " ");

    }


    /*
     Recursively checks if a string consists only of digits (0-9).
     @param s the input string to check
     @param index the current character index in the string
     @return true if all characters are digits, false otherwise
     Time Complexity: O(n) (Linear), as each character is checked once.
     */

    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }


    /**
     * Computes the binomial coefficient C(n, k) using recursion. <br>
     * Time Complexity: O(2ⁿ) (Exponential) due to repeated subproblems. <br>
     * Space Complexity: O(n) (Recursive call stack).
     *
     * @param n Total elements.
     * @param k Elements to choose.
     * @return Binomial coefficient C(n, k).
     * @throws IllegalArgumentException If n or k is negative.
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;
        if (n < 0 || k < 0) {
            throw new IllegalArgumentException("Numbers should be more than 0");
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);

    }


    /**
     * Computes the Greatest Common Divisor (GCD) using the Euclidean algorithm. <br>
     * Time Complexity: O(log min(n, m)) (Logarithmic). <br>
     *
     * @param n First number.
     * @param m Second number.
     * @return The GCD of n and m.
     */
    public static int GCD(int n, int m) {
        if (m == 0) return n;
        return GCD(m, n % m);
    }


    /**
     * Recursively calculates the nth Fibonacci number.
     * Time Complexity: O(2^n) (Exponential Time Complexity),
     * as each call branches into two more recursive calls.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The nth Fibonacci number.
     */
    public static int fibonacciSeries(int n) {
        if (n == 0 || n == 1) return n;
        return calculateFib(n - 1) + calculateFib(n - 2);
    }


    /**
     * Recursively interweaves two strings character by character.
     * Time Complexity: O(n) (Linear Time Complexity),
     * as the function makes a single recursive call for each character in the strings.
     *
     * @param s1 The first input string.
     * @param s2 The second input string.
     * @param n  The current index being processed.
     */
    public static void stringMingling(String s1, String s2, int n) {
        if (n == s1.length()) return;
        System.out.print(s1.charAt(n) + "" + s2.charAt(n));
        stringMingling(s1, s2, n + 1);
    }


    /**
     * Recursively swaps adjacent characters in a given string.
     * Time Complexity: O(n) (Linear Time Complexity),
     * as the function processes each pair of characters once.
     * @param s The input string.
     * @param index The current index being processed.
     */
    public static void stringOPermute(String s, int index) {
        if (s.length() == index) return;
        System.out.print(s.charAt(index + 1));
        System.out.print(s.charAt(index));
        stringOPermute(s, index + 2);


    }

    /**
     * Checks if the given sequence is full of colors using recursion.
     * @param s The input sequence consisting of 'R', 'G', 'Y', and 'B'.
     * @return True if the sequence satisfies all conditions, otherwise False.
     * Time Complexity: O(n) (Linear Time Complexity),
     * as each character is checked once.
     */
    public static boolean findSequenceFullOfColors(String s,int g,int b,int y,int r, int index){
        if(index == s.length()){
            return (r==g)&&(y==b);
        }
        char ch = s.charAt(index);
        if(ch == 'R') r++;
        else if(ch =='B') b++;
        else if(ch == 'G') g++;
        else if (ch == 'Y') y++;
        if(Math.abs(r-g) > 1 || Math.abs(y-b) > 1){
            return false;
        }
        return findSequenceFullOfColors(s,g,b,y,r,index+1);
    }



    /**
     * Computes the Greatest Common Divisor (GCD) using the Euclidean algorithm. <br>
     * Time Complexity: O(log min(n, m)) (Logarithmic). <br>
     *
     * @param n First number.
     * @param m Second number.
     * @return The GCD of n and m.
     */
    public static int findGcd(int n, int m) {
        if (m == 0) return n;
        return GCD(m, n % m);
    }






}
