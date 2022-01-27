import java.util.ArrayList;

public class GetStairPaths {
    static ArrayList<String> getStairs(int n)
    {
        if(n==0)
        {
            ArrayList<String>base =new ArrayList<>();
            base.add("");
            return base ;
        }
        if(n<0)
        {
            ArrayList<String>base =new ArrayList<>();;
            return base ;
        }
        ArrayList<String> ans= new ArrayList<>();
        ArrayList<String> first= getStairs(n-1);
        for(String i:first)
        {
            ans.add(1+i);

        }
        ArrayList<String> second= getStairs(n-2);
        for(String i:second)
        {
            ans.add(2+i);

        }
        ArrayList<String> third= getStairs(n-3);
        for(String i:third)
        {
            ans.add(3+i);

        }
        return ans;
    }
    public static void main(String[] args) {
        int n =4;
        ArrayList<String> result= getStairs(n);
        System.out.println(result);
    }
}
