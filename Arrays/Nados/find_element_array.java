package Array;

import java.util.Scanner;

public class find_element_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.print(i);
            }
        }
    }
}
