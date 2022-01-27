import java.util.ArrayList;

public class printStairPaths {
    static void printStairs(int n,String str,int idx)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        if(n<0)
        {
            return;
        }
        printStairs(n-1,str+1,idx+1);
        printStairs(n-2,str+2,idx+1);
        printStairs(n-3,str+3,idx+1);

    }
    public static void main(String[] args) {
        int n =3;
        System.out.println("your stairs are");
        printStairs(n,"",0);
    }
}
