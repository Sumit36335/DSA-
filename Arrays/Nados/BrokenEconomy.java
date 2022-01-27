package Array;

import java.util.Scanner;

public class BrokenEconomy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int target=sc.nextInt();
        int floor=0;
        int ceil=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==target)
            {
                floor=ceil=i;
            }
            else if(a[i]<target)
            {
                floor=i;
            }
            else
            {
                ceil=i;
                int count=i;
                if(count>1)
                {
                    break;
                }
            }
        }
        System.out.println(a[ceil]);
        System.out.println(a[floor]);
    }
}
