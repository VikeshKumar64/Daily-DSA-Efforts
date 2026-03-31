class Solution {
    public boolean scoreBalance(String s) {
        int total = 0;

        for(char c : s.toCharArray()){
            total += (c - 'a' + 1);
        }

        if(total % 2 != 0) return false;

        int half = total / 2;

        int curr = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            curr += (s.charAt(i) - 'a' + 1);

            if (curr == half) return true;
        }
        return false;
    }
}