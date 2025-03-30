

import java.util.ArrayList;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Choose the number between 1-3: ");
            System.out.println("1 - Solution of the problems.");
            System.out.println("2 - Solution of the Bonus tasks.");
            System.out.println("3 - EXIT");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    startProblem(sc);
                    break;
                case 2:
                    startBonus(sc);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }



    }
    public static void startProblem(Scanner sc){
        while(true){
            System.out.println("Choose the number between 1-10: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Problem 1: ");
                    int[] arr = readArray(sc);
                    System.out.println(findMinimumOfTheArray(arr));
                    System.out.println("---------------------------");
                    break;
                case 2:
                    System.out.println("Problem 2: ");
                    int[] arr1 = readArray(sc);
                    System.out.println(findAverageOfAnArray(arr1));
                    System.out.println("--------------------------");
                    break;
                case 3:
                    System.out.println("Problem 3: ");
                    System.out.println(isPrime(sc.nextInt()) ? "Prime" : "Composite");
                    System.out.println("---------------------------");
                    break;
                case 4:
                    System.out.println("Problem 4: ");
                    System.out.println(findFactorial(sc.nextInt()));
                    System.out.println("----------------------------");
                    break;
                case 5:
                    System.out.println("Problem 5: ");
                    System.out.println(calculateFib(sc.nextInt()));
                    System.out.println("----------------------------");
                    break;
                case 6:
                    System.out.println("Problem 6: ");
                    System.out.println(findPowerOfNum(sc.nextInt(), sc.nextInt()));
                    System.out.println("------------------------------");
                    break;
                case 7:
                    System.out.println("Problem 7: ");
                    printReverseOrder(sc.nextInt(), sc);
                    System.out.println();
                    System.out.println("-------------------------------");
                    break;
                case 8:
                    System.out.println("Problem 8: ");
                    sc.nextLine();
                    String s = sc.nextLine();
                    System.out.println(isAllDigits(s, 0) ? "Yes" : "No");
                    System.out.println("---------------------------------");
                    break;
                case 9:
                    System.out.println("Problem 9: ");
                    System.out.println(binomialCoefficient(sc.nextInt(), sc.nextInt()));
                    System.out.println("----------------------------------");
                    break;
                case 10:
                    System.out.println("Problem 10: ");
                    System.out.println(GCD(sc.nextInt(), sc.nextInt()));
                    System.out.println("-----------------------------------");
                    break;
                case 0:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;

            }

        }

    }
    public static void startBonus(Scanner sc){
        while(true){
            System.out.println("Choose the number between 1-8: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Bonus 1: Fibonacci Numbers ");
                    System.out.println(fibonacciSeries(sc.nextInt()));
                    System.out.println("---------------------------");
                    break;
                case 2:
                    System.out.println("Bonus 2: String Mingling");
                    sc.nextLine();
                    stringMingling(sc.nextLine(),sc.nextLine(),0);
                    System.out.println();
                    System.out.println("--------------------------");
                    break;
                case 3:
                    System.out.println("Bonus 3: String-o-Permute ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    String[] arr = new String[n];
                    for(int i =0; i< n;i++){
                        arr[i] = sc.nextLine();
                    }
                    for(int i =0 ;i <n;i++){
                        stringOPermute(arr[i],0);
                        System.out.println();
                    }
                    System.out.println("---------------------------");
                    break;
                case 4:
                    System.out.println("Bonus 4: Sequence full of colors ");
                    String[] arr1 = readStringArray(sc);
                    System.out.println();
                    for(int i =0;i< arr1.length;i++){
                        System.out.println(findSequenceFullOfColors(arr1[i],0,0,0,0,0));
                    }
                    System.out.println("----------------------------");
                    break;
                case 5:
                    System.out.println("Bonus 5: Computing the GCD");
                    System.out.println(findGcd(sc.nextInt(), sc.nextInt()));
                    System.out.println("----------------------------");
                    break;
                case 6:
                    System.out.println("Bonus 6: String Reductions ");
                    sc.nextLine();
                    System.out.println(stringReductions(sc.nextLine(),0,new boolean[26]));
                    System.out.println("------------------------------");
                    break;
                case 7:
                    System.out.println("Bonus 7: String Compression ");
                    sc.nextLine();
                    System.out.println(stringCompression(sc.nextLine(),0,0));
                    System.out.println("-------------------------------");
                    break;
                case 8:
                    System.out.println("Bonus 8: Pascal's Triangle ");
                    PascalTriangle(sc.nextInt());
                    System.out.println("---------------------------------");
                    break;
                case 0:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;

            }

        }

    }

    /*
      Finds the minimum element in the given array.
      @param n   the size of the array
      @param arr the array containing elements
      @return the minimum element in the array
      Time Complexity: O(n) (Linear Time Complexity),
      as we iterate through the array once.
     */

    public static int findMinimumOfTheArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
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
    public static double findAverageOfAnArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum /arr.length;
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
    public static int findFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * findFactorial(n - 1);
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


    /**
     * Recursively calculates the power of a number.
     *
     * @param n the base number
     * @param p the exponent to raise the base to
     * @return the result of n^p
     *
     * Time Complexity: O(p) (Linear Time Complexity),
     * as the function calls itself p times.
     */

    public static int findPowerOfNum(int n, int p) {
        if (p == 0) return 1;
        if (p == 1) return n;
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
        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
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
        System.out.print("" + s1.charAt(n) + s2.charAt(n));
        stringMingling(s1, s2, n + 1);
    }


    /**
     * Recursively swaps adjacent characters in a given string.
     * Time Complexity: O(n) (Linear Time Complexity),
     * as the function processes each pair of characters once.
     *
     * @param s     The input string.
     * @param index The current index being processed.
     */
    public static void stringOPermute(String s, int index) {
        if (index >= s.length()-1){
            System.out.print(s.charAt(index));
            return;
        }
        if (s == null || s.isEmpty()) {
            return;
        }
        System.out.print(s.charAt(index + 1));
        System.out.print(s.charAt(index));
        if (index + 2 < s.length()) {
            stringOPermute(s, index + 2);
        }


    }

    /**
     * Checks if the given sequence is full of colors using recursion.
     *
     * @param s The input sequence consisting of 'R', 'G', 'Y', and 'B'.
     * @return True if the sequence satisfies all conditions, otherwise False.
     * Time Complexity: O(n) (Linear Time Complexity),
     * as each character is checked once.
     */
    public static boolean findSequenceFullOfColors(String s, int g, int b, int y, int r, int index) {
        if (index == s.length()) {
            return (r == g) && (y == b);
        }
        char ch = s.charAt(index);
        if (ch == 'R') r++;
        else if (ch == 'B') b++;
        else if (ch == 'G') g++;
        else if (ch == 'Y') y++;
        if (Math.abs(r - g) > 1 || Math.abs(y - b) > 1) {
            return false;
        }
        return findSequenceFullOfColors(s, g, b, y, r, index + 1);
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
        return findGcd(m, n % m);
    }


    /**
     * Recursively removes duplicate characters from the string.
     *
     * @param s       The input string.
     * @param n       Current position in the string.
     * @param letters Boolean array to track seen characters.
     * @return The string after removing duplicates.
     * <p>
     * Time Complexity: O(n) (Linear Time Complexity),
     * as each character is processed once.
     */
    public static String stringReductions(String s, int n, boolean[] letters) {
        if (s.length() == n) return "";
        char currentChar = s.charAt(n);
        if (letters[currentChar - 'a']) {
            return stringReductions(s, n + 1, letters);
        }
        letters[currentChar - 'a'] = true;
        return currentChar + stringReductions(s, n + 1, letters);

    }

    /**
     * Recursively compresses the given message.
     * @param s The input string.
     * @param n Current position in the string.
     * @param count Current count of consecutive characters.
     * @return The compressed string.
     *
     * Time Complexity: O(n) - Each character is processed once.
     */
    public static String stringCompression(String s, int n, int count) {
        if (n == s.length()) {
            return count>1 ? String.valueOf(count) : "";
        }
        if (n > 0 && s.charAt(n) == s.charAt(n - 1)) {
            return stringCompression(s, n + 1, count + 1);
        }
        return  (count>1 ? count : "")+"" + s.charAt(n) + stringCompression(s,n+1,1);

    }
    public static int[] readArray(Scanner sc){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i< n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static String[] readStringArray(Scanner sc){
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextLine();
        }
        return arr;
    }

    public static void PascalTriangle(int n){
        for(int i =0 ;i <n;i++){
            for(int j =0;j<=i;j++){
                System.out.print(binomialCoefficient(i,j) + " ");

            }
            System.out.println();
        }
    }

}



