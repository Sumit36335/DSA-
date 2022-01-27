package Array;

import java.util.Scanner;

public class Decimal_any_Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(myFunction(n, b));
    }
   static int myFunction(int n ,int b) {
        int p=1;
        int no=0;
        int rem;
        while(n!=0)
        {
            rem=n%b;
            no=no+rem*p;
            n=n/b;
            p=p*10;
        }
        return no;
   }

}
