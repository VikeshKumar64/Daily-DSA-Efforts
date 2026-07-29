class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)){
                ans += Math.abs((int)s.charAt(i) - (int)s.charAt(i-1));
            }
        }
        return ans;
    }
}