package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,46,4,6,7,8};
        insertionSort(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static void insertionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}
