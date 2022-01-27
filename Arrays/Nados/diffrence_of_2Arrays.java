package Array;

import java.util.Scanner;

public class diffrence_of_2Arrays
{
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
        int [] arr3=new int[n2];
        int i=arr1.length-1;
        int j= arr2.length-1;
        int k= arr3.length-1;
        int d;
        int c=0;
        while(k>=0)
        {

            int ar1=(i>=0?arr1[i]:0);
            d=0;
            if(arr2[j]+c>=ar1)
            {
                d=arr2[j]+c-ar1;
                c=0;
            }
            else
            {
                d=arr2[j]+10+c-ar1;
                c=-1;
            }
            arr3[k]=d;
            i--;
            j--;
            k--;
        }
        int idx=0;
        while(idx<arr3.length)
        {
            if(arr3[idx]==0) {
                idx++;
            }
            else
            {
                break;
            }
        }
        while(idx<arr3.length){
            System.out.println(arr3[idx]);
            idx++;
        }
    }
}
