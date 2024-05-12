

//User function Template for Java

class find_the_median
{
    public int find_median(int[] v)
    {
      Arrays.sort(v);
      int n=v.length;
      int median;
      
 
        // check for even case
        if (n % 2 != 0)
            median=v[n / 2];
        else
            median=(v[(n-1)/2]+v[n/2])/2;
        return median;
    }
}