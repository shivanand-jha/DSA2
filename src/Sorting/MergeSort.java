package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] a={1,3,5,7,9};
        int[] b={2,4,6,8,10};
//        System.out.println(MSort(a,b));
        for (int c :
                MSort(a, b)) {
            System.out.println(c);
        }
    }
    public static int[] MSort(int[] a,int[] b)
    {
        int[] result = new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
       while (i<a.length && j<b.length){
          if(a[i]<b[j])
          {
                result[k]=a[i];
                k++;
                i++;
          }
          else {
              result[k]=b[j];
              k++;
              j++;
          }
        }

        while (i<a.length)
        {
            result[k]=a[i];
            k++;
            i++;
        }
        while (j<b.length)
        {
            result[k]=b[j];
            k++;
            j++;
        }
        return result;
    }
}
