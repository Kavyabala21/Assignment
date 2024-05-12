

//User function Template for Java

class Swap_two_numbers{
    static List<Integer> get(int a,int b)
    {
        // code here
        List<Integer>ans= new ArrayList<Integer>();
        a=a+b;
        b=a-b;
        a=a-b;
        ans.add(a);
        ans.add(b);
        return ans;
    }
}