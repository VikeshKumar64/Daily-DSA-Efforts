class Solution {
    public boolean good(int num){
        boolean change = false;
        while(num > 0){
            int rem = num % 10;
            if(rem == 3 || rem == 4 || rem == 7) return false;
            if(rem == 2 || rem == 5 || rem == 6 || rem == 9) change = true;
            num /= 10;
        }
        return change;
    }
    public int rotatedDigits(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(good(i)) count++;
        }
        return count;
    }
}