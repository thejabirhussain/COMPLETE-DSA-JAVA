import java.util.*;
public class Q1 {
    public static void LinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key found at index: " + i);
                return;
            }
        }
        System.out.println("Key not found");
    }
    public static void BinarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                System.out.println("Key found at index: " + mid);
                return;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Key not found");
    }
    public static void LargestElement(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest element is: " + largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 23, 45, 12, 67, 34, 89 };
        // int Binarysearch[]={12,23,34,45,67,89};
        // int BinarySearchKey=34;
        // BinarySearch(Binarysearch, BinarySearchKey);
        // System.out.print("Enter the key to search: ");
        // int key = sc.nextInt();
        // LinearSearch(arr, key);
        LargestElement(arr);
        sc.close();
    }
}