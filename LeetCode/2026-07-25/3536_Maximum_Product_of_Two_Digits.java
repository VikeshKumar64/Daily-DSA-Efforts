class Solution {
    public int maxProduct(int n) {
        int max = -1;
        int smax = -1;
        while(n > 0){
            int rem = n % 10;
            if(max <= rem){
                smax = max;
                max = rem;
            }
            else if(smax < rem) smax = rem;
            n /= 10;
        }
        return smax * max;
    }
}