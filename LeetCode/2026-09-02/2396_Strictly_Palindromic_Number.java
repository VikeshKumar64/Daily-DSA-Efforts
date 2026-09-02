class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2; i < n-1; i++){

            String number = Integer.toString(n,i);

            int l = 0;
            int r = number.length()-1;

            while(l < r){
                if (number.charAt(l) != number.charAt(r)){
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}