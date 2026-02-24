class Solution {
    public boolean prime(long num){
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
    public long splitArray(int[] nums) {
        long n = nums.length;
        long sum1 = 0;
        long sum2 = 0;

        for(int i = 0; i < n; i++){
            if(prime(i)) sum1 += nums[i];
            else sum2 += nums[i];
        }
        return Math.abs(sum1 - sum2);

    }
}