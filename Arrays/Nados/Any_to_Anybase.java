package Array;

import java.util.Scanner;

public class Any_to_Anybase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.println(myFunction(n,b1,b2));
    }
    static int myFunction(int n ,int b1,int b2)
    {
        int num=n;
        int base10=0;
        int p=1;
        // base10= any base to decimal leke ana hoga
        while(num!=0)
        {
                int rem =num%10;
                base10+=rem*p;
                num/=10;
                p*=b1;
        }
        // baseany= decimal to any base lana hoga
        int baseAny=0;
        int p1=1;
        int num2=base10;
        while(num2!=0)
        {
            int rem=num2%b2;
            baseAny+=rem*p1;
            p1*=10;
            num2/=b2;
        }
        return baseAny;
    }
}
