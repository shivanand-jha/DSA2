package Questions;

import java.util.Scanner;

public class OneCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i <s.length(); i++) {
                if(s.charAt(i)=='1')
                    count++;
        }
        System.out.println(count);
    }
}
