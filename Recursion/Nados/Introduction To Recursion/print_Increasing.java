public class print_Increasing {
    static  void function1(int n)
    {
        if(n==0)return;
        function1(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        function1(n);
    }
}
