package Array;

import java.util.Scanner;

public class Any_base_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b= sc.nextInt();
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        System.out.println(myFunction(b,n1,n2));
    }
    static int myFunction(int b,int n1,int n2)
    {
        int sum_q=0;
        int sum_rem=0;
        int p=1;
        int orignal_sum=0;
        while(n1>0||n2>0||sum_q>0)
        {
            int rem1=n1%10;
            int rem2=n2%10;
            n1/=10;
            n2/=10;
            sum_rem=sum_q+(rem1+rem2);
            sum_q=sum_rem/b;
            orignal_sum+=(sum_rem%b)*p;
            p*=10;
        }
        return orignal_sum;
    }
}
