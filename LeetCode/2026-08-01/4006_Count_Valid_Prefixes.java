class Solution {
    public int countValidPrefixes(String s) {
        int z = 0, one = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                z++;
            else
                one++;

            if (Math.abs(z - one) <= 1)
                ans++;
        }

        return ans;
    }
}