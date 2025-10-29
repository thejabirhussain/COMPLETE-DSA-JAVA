import java.util.*;
public class Introduction {
    public static void printArray(int arr[],int a){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arr[0]=0;
         a=10;
    }
    public static void main(String[] args) {
        //creation of a array
        // int arr[]={99,100,99};
        // String str[]={"apple","mango","banana"};
        // boolean isPrime[]={true,false,true,false};
        // int arr1[]=new int[3];
        //math
        // arr1[0]=99;
        //phy
        // arr1[1]=100;
        //chem
        // arr1[2]=99;
        //printing
        // System.out.println(arr1[0]);
        // System.out.println(arr1[1]);
        // System.out.println(arr1[2]);
       Scanner sc=new Scanner(System.in);
       int marks[]=new int[2];
       for(int i=0;i<marks.length;i++){
        marks[i]=sc.nextInt(); 
       }
       System.out.println("printing marks");
       int a=20;
        printArray(marks,a); 
        System.out.println(a);
        System.out.print(marks[0]);


    }
}