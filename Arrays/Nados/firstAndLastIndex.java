package Array;

import java.util.Scanner;

public class firstAndLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++) {
            if (a[i] == target) {
                if (count1 == 0) {
                    count1 = i;
//                    count2=i;
                } else {
                    count2 = i;
                }

            }
        }
            if(count1==0)
            {
                System.out.println("-1");
                System.out.println("-1");
            }
            else
            {
                System.out.println(count1);
                System.out.println(count2);
            }

    }
}
