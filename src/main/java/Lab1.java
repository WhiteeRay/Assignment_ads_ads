import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n;i++){
            arr[i] =sc.nextInt();
        }




        System.out.println(findMinimumOfTheArray(n,arr));
        System.out.println(findAverageOfAnArray(n,arr));
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
        int sum =0;
        for(int num : arr){
            sum+=num;
        }
        return (double) sum/n;
    }




}
