package Array;

import java.util.Scanner;

public class sum_of_2Arrays {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n1 = sc.nextInt();
        int [] arr1  = new int[n1];
        for (int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int n2 = sc.nextInt();
        int [] arr2  = new int[n2];
        for (int j=0;j<n2;j++)
        {
            arr2[j]=sc.nextInt();
        }
        int max = n1>n1?n1:n2;
        int [] arr3= new int[max];
        int i= arr1.length-1;
        int j=arr2.length-1;
        int k = arr3.length-1;
        int d;
        int c=0;
        while(k>=0)
        {
            d=c;
            if(i>=0)
            {
                d+=arr1[i];
            }
            if(j>=0)
            {
                d+=arr2[j];
            }
            c=d/10;
            d=d%10;
            arr3[k]=d;
            i--;
            j--;
            k--;
        }
        if(c!=0)
        {
            System.out.println(c);
        }
        for(int l=0;l<arr3.length;l++)
        {
            System.out.println(arr3[l]);
        }
    }
}
