package Array;

import java.util.Scanner;

public class AnyBase_toDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int d = sc .nextInt();
        System.out.println(myFunction(n,d));
    }
    static int myFunction(int n ,int d)
    {
        int p=1;
        int no=0;
        while(n!=0)
        {
            int rem =n%10;
            no=no+rem*p;
            n=n/10;
            p=p*d;
        }
        return no;
    }
}
