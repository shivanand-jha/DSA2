package Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
       QSort s= new QSort();
        s.QSort1(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
class QSort
{
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[] arr , int beg, int end )
    {
        int pivot =arr[end];
        int i=beg-1;
        for (int j = 0; j <=end; j++) {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return i+1;
    }
    public static void QSort1(int[] arr , int beg , int end)
    {
        if(beg<end)
        {
            int split=partition(arr, beg, end);
            QSort1(arr,beg,split-1);
            QSort1(arr,split+1,end);
        }
    }
}