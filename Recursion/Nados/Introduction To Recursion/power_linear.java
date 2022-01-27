public class power_linear {
    static  int powerfunc(int b,int p)
    {
        if(p==0)return 1;
        return b*powerfunc(b,p-1);
    }
    public static void main(String[] args) {
        int b=2;
        int p=5;
        System.out.println(powerfunc(b, p));
    }
}
