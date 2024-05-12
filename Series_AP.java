

class Series_AP {
    
    public static int nthTermOfAP(int a1, int a2, int n) {
        // Calculate the common difference of the arithmetic progression
        int d = a2 - a1;
        // Calculate the nth term of the arithmetic progression using the formula
        return a1 + (n - 1) * d;
    }
}