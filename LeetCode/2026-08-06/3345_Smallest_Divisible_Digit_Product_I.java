class Solution {
    public int pro(int n){
        int prod = 1;
        while(n > 0){
            int rem = n % 10;
            prod *= rem;
            n /= 10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        int max = Integer.MAX_VALUE;
        for(int i = n;  i < max; i++){
            if(pro(i) % t == 0){
                return i;
            }
        }
        return -1;
    }
}