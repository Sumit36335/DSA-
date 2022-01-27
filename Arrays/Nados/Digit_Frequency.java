package Array;

import java.util.Scanner;

public class Digit_Frequency {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc .nextInt();
        int d= sc.nextInt();
        System.out.print(myFunction(n,d));
    }
    static int myFunction(int n , int d)
    {
        while(n!=0)
        {
            int rem = n%10;
            if(rem==d)count++;
            n/=10;
        }
        return count;
    }
}
