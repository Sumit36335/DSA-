package Array;

import java.util.Scanner;

public class Any_base_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int b= sc.nextInt();
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        System.out.println(myFunction(b,n1,n2));
    }
    static int myFunction(int b,int n1,int n2)
    {
        int d=0;
        int c=0;
        int answer=0;
        int p=1;
        while(n2>0)
        {
            int rem1 = n1%10;
            int rem2 = n2%10;
            n1/=10;
            n2/=10;
            rem2=rem2+c;
            if(rem2>=rem1)
            {
                c=0;
                d=rem2-rem1;
            }

            else
            {
                c=-1;
                d=(rem2+b)-rem1;
            }
            answer+=d*p;
            p*=10;
        }
        return answer;
    }
}
