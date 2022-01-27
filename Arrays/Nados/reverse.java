package Array;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=arr.length-1;
        for(start=0 ;start<=end;start++,end--)
        {
            int temp =  arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
