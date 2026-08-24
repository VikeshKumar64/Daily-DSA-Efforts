class Solution {
    public boolean isPalindromic(String s) {
        String store = "";

        for(int i = 0; i < s.length(); i++){
            int p = s.charAt(i);
            store += String.format("%8s", Integer.toBinaryString(p & 0xFF)).replace(' ', '0');
        }
        int n = store.length();
        for(int i = 0; i < n/2; i++){
            if(store.charAt(i) != store.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}