class Stream_avg {
    float[] streamAvg(int[] arr, int n) {
         float[] averages = new float[n];
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            count++;
            averages[i] = (float) sum / count;
        }
        
        return averages;
    }
    }