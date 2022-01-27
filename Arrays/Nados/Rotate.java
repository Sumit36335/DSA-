package Array;

import java.util.Scanner;

public class Rotate {
    public static void reverse(int[] arr,int start,int end){
        for(int i= start ;i<=end;i++,end--)
        {
            int temp =  arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        k=k%a.length;
        if(k<0)
        {
            k=k+a.length;
        }
        reverse(a,0,a.length-k-1);
        reverse(a,a.length-k,a.length-1);
        reverse(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
