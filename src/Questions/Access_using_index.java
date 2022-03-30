package Questions;

import java.util.Scanner;

public class Access_using_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index of Array");
        int index = sc.nextInt();
        System.out.println(index_value(arr, index));
    }
    public static int index_value(int[] arr, int m)
    {
        return arr[m];
    }
}
