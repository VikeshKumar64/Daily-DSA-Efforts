class Solution {
    public boolean isPalindrome(String s) {
        String lowerS = s.toLowerCase();
        int n = lowerS.length();
        int l = 0;
        int r = n-1;
        return helper(lowerS.toCharArray(),l,r);
    }
    public boolean helper(char arr[], int l, int r){
        if(l >= r) return true;
        if(!Character.isLetterOrDigit(arr[l])) return helper(arr, l+1, r);
        if(!Character.isLetterOrDigit(arr[r])) return helper(arr, l, r-1);
        if(arr[l] != arr[r]) return false;
        return helper(arr,l+1,r-1);
    }
}