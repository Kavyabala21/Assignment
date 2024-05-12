

// User function Template for Java

class Palindrome_sum {
    
   
    int isDigitSumPalindrome(int n) {
           int sum=0;
        while(n>0){
         
            sum +=n%10;
            n=n/10;
        }
        
        int rem=sum;
         int rev=0;
        while(rem>0){
            
        
         rev =rev*10 +rem%10;
            rem =rem/10;
            
        }
        if(sum ==rev){
            return 1;
        }
        
      
       return 0;
    }
}