import java.util.*;
public class sorting {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        //time - O(n^2)
        //space - O(1)
        for(int i=0;i<n-1;i++){// outer loop -number of turns
            for(int j=0;j<n-i-1;j++){ //inner loop - comparison in each turn
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        int n=arr.length;
        //time - O(n^2)
        //space - O(1)
        for(int i=0;i<n-1;i++){ //outer loop - number of turns
            int minIndex=i;
            for(int j=i+1;j<n;j++){ //inner loop - finding the minimum element index
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            //swap
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void inbbuildSort(int arr[]){
        Arrays.sort(arr); //uses Timsort algorithm
        //tcime - O(n log n)
        //space - O(1)
    }
    public static void countingSort(int arr[]){
        int n=arr.length;
        //time - O(n+k) k is the range of input
        //space - O(k)
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int count[]=new int[max+1];
        //store the frequency of each element
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        //modify the original array
        int index=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[index]=i;
                index++;
                count[i]--;
            }
        }
    }
    public static void insertionSort(int arr[]){
        int n=arr.length;
        //time - O(n^2)
        //space - O(1)
        for(int i=1;i<n;i++){ //outer loop - number of turns
            int current=arr[i];
            int j=i-1;
            //finding the correct position to insert the current element
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            //inserting the current element at its correct position
            arr[j+1]=current;
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        countingSort(arr);
        System.out.println("Sorted array is:");
        printArray(arr);
    }
}