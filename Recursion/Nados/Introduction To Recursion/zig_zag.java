public class zig_zag {
    static void myfunction(int n)
    {
        if(n==0)return;
        System.out.print(n+" ");
        myfunction(n-1);
        System.out.print(n+" ");
        myfunction(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        int n =3;
        myfunction(n);
    }
}
