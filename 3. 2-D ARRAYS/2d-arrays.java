import java.util.*;

public class DSA {

    public static void spiral_matrix(int arr[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = arr.length - 1;
        int endcol = arr[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(arr[startrow][j] + " ");
            }
            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(arr[i][endcol] + " ");
            }
            // bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) break;
                System.out.print(arr[endrow][j] + " ");
            }
            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) break;
                System.out.print(arr[i][startcol] + " ");
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    }

    public static void diagonal_sum(int arr[][]) {
        int primary_diagonal = 0;
        int secondary_diagonal = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    primary_diagonal += arr[i][j];
                }
                if (i + j == arr.length - 1 && i != j) {
                    secondary_diagonal += arr[i][j];
                }
            }
        }

        int total_sum = primary_diagonal + secondary_diagonal;
        System.out.println("The sum of diagonals is: " + total_sum);
    }

    // ✅ Fixed method name
    public static void binarySearch2D(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            int si = 0;
            int ei = arr[0].length - 1;
            while (si <= ei) {
                int mid = si + (ei - si) / 2;
                if (arr[i][mid] == key) {
                    System.out.println("Key found at index: " + i + "," + mid);
                    return;
                } else if (arr[i][mid] < key) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }
        System.out.println("Key not found");
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
        // spiral_matrix(arr);

        // diagonal_sum(arr); // The sum of diagonals is: 68

        binarySearch2D(arr, 7); // Key found at index: 1,2
    }
}
