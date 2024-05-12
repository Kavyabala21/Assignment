

//User function Template for Java
class No_of_divisors{
    static long count_divisors(int N){
         int count = 0;
        int sqrtN = (int) Math.sqrt(N);
        for (int i = 1; i <= sqrtN; i++) {
            if (N % i == 0) {
                if (i % 3 == 0) {
                    count++;
                }
                if (i != N / i && (N / i) % 3 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}