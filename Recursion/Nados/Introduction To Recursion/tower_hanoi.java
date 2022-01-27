public class tower_hanoi {
    static  void toh(int n,int a,int b,int c)
    {
        if(n==0)return;
        toh(n-1,a,c,b);
        System.out.println(n+"["+a+" -> "+b+"]");
        toh(n-1,c,b,a);
    }
    public static void main(String[] args) {
        int total=3;
        int d1=10;
        int d2=11;
        int d3=12;
        toh(total,d1,d2,d3);
    }
}
