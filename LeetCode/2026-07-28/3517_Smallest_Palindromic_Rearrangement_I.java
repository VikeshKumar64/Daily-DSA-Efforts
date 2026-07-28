class Solution {
    public String smallestPalindrome(String s) {
        int freq[] = new int[26];

        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }

        StringBuilder l = new StringBuilder();
        char mid = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                mid = (char) ('a' + i);
            }

            for (int j = 0; j < freq[i] / 2; j++) {
                l.append((char) ('a' + i));
            }
        }
        StringBuilder ans = new StringBuilder();
        ans.append(l);

        if(mid != 0) ans.append(mid);

        ans.append(new StringBuilder(l).reverse());
        return ans.toString();
    }
}