

//User function Template for Java

class reverse_digits
{
    public long reverse_digit(long n)
    {
        // Code here
        long rev=0;
        while(n>0)
        {
           rev = (rev*10) + n%10;
           n = n/10;
        }
        return rev;
    }
}