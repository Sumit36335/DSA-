public class power_logaritghmic {
    static  int powerfunc(int b,int p)
    {
        if(p==0)return 1;
        int ans= powerfunc(b,p/2)*powerfunc(b,p/2);
        if(p%2!=0)
        {
            ans*=b;
        }
        return ans;
    }
    public static void main(String[] args) {
        int b=2;
        int p=4;
        System.out.println(powerfunc(b, p));
    }
}
