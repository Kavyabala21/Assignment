

// User function Template for Java

class Greatest_of_three {
    int greatestOfThree(int A, int B, int C) {
        int temp;
        // code here
        if(A<B)
        {
            temp=A;
            A=B;
            B=temp;
        }
        if(B<C)
        {
            temp=B;
            B=C;
            C=temp;
        }
        if(A<B)
        {
            temp=A;
            A=B;
            B=temp;
        }
        return A;
    }
}