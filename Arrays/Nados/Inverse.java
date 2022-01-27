package Array;

import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int[]arr2=new int[n];
        for(int i=0;i<a.length;i++)
        {
            arr2[a[i]]=i;
        }
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+"  ");
        }
    }
}
