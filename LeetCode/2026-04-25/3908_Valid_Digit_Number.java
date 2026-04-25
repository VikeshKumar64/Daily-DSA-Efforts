class Solution {
    public boolean validDigit(int n, int x) {

        if(n == 0) return false;
        int start = n;

        while(n >= 10){
            n /= 10;
        }
        if(n == x) return false;

        n = start;
        while(n > 0){
            if( n % 10 == x) return true;
            n = n / 10;
        }
        return false;
    }
}