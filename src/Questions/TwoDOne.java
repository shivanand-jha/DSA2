package Questions;

import java.util.Scanner;

public class TwoDOne {
    public static void main(String[] args) {
        inputArray();
    }
    public static void inputArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row :");
        int m=sc.nextInt();
        System.out.println("Enter the size of column :");
        int n=sc.nextInt();
        int[][] arr =new int[m][n];
        System.out.println("Enter the element of array :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
