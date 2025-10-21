import java.util.*;
public class Q2 {
    public static void reverseArray(int arr[]) {
        //space - O(1) 
        //time - O(n)
       for(int i=0;i<arr.length/2;i++) {
            //swapping
           int temp = arr[i];
           arr[i] = arr[arr.length - i - 1];
           arr[arr.length - i - 1] = temp;
       }
         //print the reversed array
         for(int i=0;i<arr.length;i++) {
              System.out.print(arr[i] + " ");
         }
    }
    public static void pairsofarray(int arr[]) {
        //space - O(n^2)
        //time - O(n^2)
        //outer loop - fixing one element
        for(int i=0;i<arr.length;i++) {
            //inner loop - traversing the rest of the array
            for(int j=i+1;j<arr.length;j++) {
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }
    public static void printsubarrays(int arr[]) {
        //space - O(1)
        //time - O(n^3)
        //starting point
        for(int i=0;i<arr.length;i++) {
            //ending point
            int start=i;
            for(int j=i;j<arr.length;j++) {
                //print subarray from i to j
                int end=j;
                for(int k=start;k<=end;k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void printmaxsubarraysum(int arr[]) {
        //space - O(1)
        //time - O(n^3)
        int maxsum = Integer.MIN_VALUE;
        //starting point
        for(int i=0;i<arr.length;i++) {
            //ending point
            int start=i;
            for(int j=i;j<arr.length;j++) {
                //print subarray from i to j
                int end=j;
                int c_sum = 0;
                for(int k=start;k<=end;k++) {
                    c_sum += arr[k];
                }
                if(c_sum > maxsum) {
                    maxsum = c_sum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxsum);
    }
    public static void printsubarraysum(int arr[]) {
        //space - O(1)
        //time - O(n^2)
        int maxsum = Integer.MIN_VALUE;
        //starting point
        for(int i=0;i<arr.length;i++) {
            //ending point
            int start=i;
            int c_sum = 0;
            for(int j=i;j<arr.length;j++) {
                //print subarray from i to j
                int end=j;
                c_sum += arr[end];
                if(c_sum > maxsum) {
                    maxsum = c_sum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxsum);
    }
    public static void kadanesAlgorithm(int arr[]) {
        //space - O(1)
        //time - O(n)
        int maxsum = Integer.MIN_VALUE;
        int c_sum = 0;
        for(int i=0;i<arr.length;i++) {
            c_sum += arr[i];
            if(c_sum > maxsum) {
                maxsum = c_sum;
            }
            if(c_sum < 0) {
                c_sum = 0;
            }
        }
        System.out.println("Maximum Subarray Sum using Kadane's Algorithm: " + maxsum);
    }
    public static void buystock(int prices[]) {
        int res=-0;
       for(int i=0;i<prices.length;i++) {
        for(int j=i+1;j<prices.length;j++) {
            res = Math.max(res, prices[j]-prices[i]);
        }
       }
       System.out.println("Maximum Profit: " + res);
    }
    public static void main(String[] args) {
       int arr[] = {7,1,5,3,6,4};
        //  reverseArray(arr);
        // pairsofarray(arr);
        // printsubarrays(arr);
        // printmaxsubarraysum(arr);
        // printsubarraysum(arr);
        // kadanesAlgorithm(arr);
        buystock(arr);
    }
}