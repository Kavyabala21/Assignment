

//User function Template for Java
class armstrong_numbers {
    static String armstrongNumber(int n){
        // code here
        if(n == 0) return "Yes";
        int num = n;
        String flag = "No";
        int sum = 0;
        int prev = 0;
        while(num>0){
            prev = num%10;
            sum = sum + (int)Math.pow(prev,3);
            
            num = num/10;
            if(sum == n){
                flag = "Yes";
              
            }
            else{
                flag = "No";
            }
        }
        
        
        return flag;
    }
}