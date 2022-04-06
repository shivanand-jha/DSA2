package Questions;
import java.util.Scanner;
public class unionOfTheArray {
    public static int print(int i, int []a, int sum){
        if(i>=a.length){
            return sum;
        }
        else{
        for(int j=i+1;j<a.length;j++){
            if(a[i]==a[j]){
                sum++;
            }
        }

        }
        return print(i+1, a, sum);
    }
    public static void main(String[] args) {
        int[]a;
        System.out.println("Enter the first array size");
     Scanner sc=new Scanner(System.in);
     int n= sc.nextInt();
        System.out.println("Enter the second array size");
        int m=sc.nextInt();
        a=new int[m+n];
        System.out.println("Enter the element of first array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element of second array");
        for (int i=n;i<m+n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(a.length-print(0, a, 0));
    }
}
