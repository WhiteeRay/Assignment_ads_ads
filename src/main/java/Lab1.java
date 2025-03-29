import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



        printReverseOrder(n,sc);
        sc.close();


    }

    /*
          Finds the minimum element in the given array.
          @param n   the size of the array
          @param arr the array containing elements
          @return the minimum element in the array
          Time Complexity: O(n) (Linear Time Complexity),
          as we iterate through the array once.
         */
    public static int findMinimumOfTheArray(int n, int[] arr){
        int min =arr[0];
        for(int i = 1;i < n;i++){
            if(arr[i] < min){
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
    public static double findAverageOfAnArray(int n, int[] arr){
        int sum = 0;
        for(int num : arr){
            sum+=num;
        }
        return (double) sum/n;
    }

    /**
     * Checks if a number is prime.
     * @param num the number to check
     * @return true if the number is prime, otherwise false
     * Time Complexity: O(√n) (Sublinear Time Complexity),
     * since we check divisibility up to sqrt(n).
     */

    public static boolean isPrime(int num){
        if(num <2) return false;
        for(int i = 2; i<=Math.sqrt(num);i++){
            if(num % i ==0) return false;
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
    public static int factorial(int n){
        if(n==0|| n==1) return 1;
        return n * factorial(n-1);
    }


    public static int calculateFib(int n){
        // Base cases: Fibonacci of 0 is 0, and Fibonacci of 1 is 1
        // Time Complexity: O(1) (constant time for base cases)
        if(n ==0 || n==1) return n;

        // Recursive case: Fibonacci of n is the sum of the previous two Fibonacci numbers
        // Time Complexity: O(2^n) (exponential time complexity)
        return calculateFib(n-1) + calculateFib(n-2);
    }


    public static int findPowerOfNum(int n, int p){
        // Base case: Any number raised to the power of 0 is 1
        // Time Complexity: O(1) (constant time for base case)
        if(p==0) return 1;

        // Base case: Any number raised to the power of 0 is 1
        // Time Complexity: O(1) (constant time for base case)
        if(p==1) return n;

        // Recursive case: Multiply 'n' by the result of findPowerOfNum(n, p-1)
        // Time Complexity: O(p) (linear time complexity)
        return n* findPowerOfNum(n,p-1);

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
    public static void printReverseOrder(int n, Scanner sc){
        if(n==0) return;
        int num = sc.nextInt();
        printReverseOrder(n-1,sc);
        System.out.print(num + " ");

    }




}
