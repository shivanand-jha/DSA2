package Questions;

import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(maxOfArr(arr));

    }
    public static int maxOfArr(int[] arr)
    {
        int max =Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(max<arr[i])
                max=arr[i];
        }
        return max;

    }
}
