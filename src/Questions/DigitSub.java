package Questions;

import java.util.Scanner;

public class DigitSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int pro=1;
        int sum=0;
        while (n>0)
        {
            int t=n%10;
            n=n/10;
            sum+=t;
            pro*=t;
        }
        System.out.println(pro-sum);
    }
}
