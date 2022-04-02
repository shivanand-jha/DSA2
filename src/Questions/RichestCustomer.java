package Questions;

import java.util.Arrays;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{1,5,1}};
        System.out.println(maximumWealth(a));

    }
    public static int maximumWealth(int[][] a) {
        int[] sum=new int[a.length];
        for(int i=0; i<a.length; i++)
        { int t=0;
            for(int j=0; j<a[0].length;j++)
            {
                t=t+a[i][j];
            }
            sum[i]=t;
        }
        Arrays.sort(sum);
        return sum[a.length-1];
    }
}
