package Array;

import java.util.Scanner;

public class Any_base_Multpication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b= sc.nextInt();
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int answer=0;
        int p=1;
        while(n2>0)
        {
            int rem2= n2%10;
            n2=n2/10;
            int spd=single_digit_multiply(n1,rem2,b);
            answer=addFunc(b,answer,spd*p);
            p=p*10;
        }
        System.out.print(answer);
    }
    static int single_digit_multiply(int n1,int num2,int b)
    {
        int c=0;
        int answer=0;
        int p=1;
        while(n1>0||c>0)
        {
            int rem1=n1%10;
            int rem_digit=c+(rem1*num2);
            c=rem_digit/b;
            answer+=(rem_digit%b)*p;
            p=p*10;
            n1/=10;
        }
        return answer;
    }

    static int addFunc(int b1,int n11,int n22)
    {
        int sum_q=0;
        int sum_rem=0;
        int p=1;
        int orignal_sum=0;
        while(n11>0||n22>0||sum_q>0)
        {
            int rem1=n11%10;
            int rem2=n22%10;
            n11/=10;
            n22/=10;
            sum_rem=sum_q+(rem1+rem2);
            sum_q=sum_rem/b1;
            orignal_sum+=(sum_rem%b1)*p;
            p*=10;
        }
        return orignal_sum;
    }

}
