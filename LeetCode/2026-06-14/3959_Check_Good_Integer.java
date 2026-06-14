class Solution {
    public boolean checkGoodInteger(int n) {
        int sum = 0;
        int sSum = 0;
        int rem = 0;
        while(n > 0){
            rem = n%10;
            sum += rem;
            sSum += rem * rem;
            n = n / 10;
        }
        return sSum - sum >= 50 ? true : false;
    }
}