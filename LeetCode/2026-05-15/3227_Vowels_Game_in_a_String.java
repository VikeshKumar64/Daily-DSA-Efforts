class Solution {
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public boolean doesAliceWin(String s) {
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(isVowel(ch)) {
                return true;
            }
        }
        return false;
    }
}