class Solution {
    public int firstMatchingIndex(String s) {
        int len = s.length();

        for(int i = 0; i < len; i++){
            if(s.charAt(i) == s.charAt(len - i - 1)){
                return i;
            }
        }
        return -1;
    }
}