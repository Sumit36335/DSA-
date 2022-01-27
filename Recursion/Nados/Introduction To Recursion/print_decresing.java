public class print_decresing {
    static  void function1(int n)
    {
        if(n==0)return;
        System.out.println(n);
        function1(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        function1(n);
    }
}

