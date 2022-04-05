package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {7,2,6,9,1,5,4};
        selectionSort(arr);
        for (int a : arr) {
            System.out.print(a+" ");
        }
    }
    public  static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            int min=arr[i];
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++){
                if(arr[j]<min)
                {
                    min=arr[j];
                    minIndex=j;
                }
            }
            if(arr[minIndex]!=i)
            {
                arr[minIndex]=arr[i];
                arr[i]=min;
            }
        }
    }
}
