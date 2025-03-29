package Recursion;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n;i++){
            arr[i] =sc.nextInt();
        }


        /*
          Finds the minimum element in the given array.
          @param n   the size of the array
          @param arr the array containing elements
          @return the minimum element in the array
          Time Complexity: O(n), where n is the number of elements in the array
          The function iterates through the array once, making it linear in complexity.
         */

        System.out.println(minimumOfTheArray(n,arr));
        sc.close();


    }

    public static int minimumOfTheArray(int n, int[] arr){
        int min =arr[0];
        for(int i = 1;i < n;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
