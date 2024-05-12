

//User function Template for Java
class Multiplication_table{
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer>ans=new ArrayList<Integer>();
        int s=0;
        for(int i=1;i<=10;i++)
        {
          s=N*i;
          ans.add(s);
        }
        return ans;
    }
}