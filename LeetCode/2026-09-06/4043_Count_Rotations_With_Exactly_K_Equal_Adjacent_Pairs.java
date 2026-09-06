class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int ans = 0;

        for(int i = 0; i < n; i++){
            String rotation = s.substring(i) + s.substring(0, i);

            int sc = 0;
            for (int j = 0; j < n - 1; j++) {
                if (rotation.charAt(j) == rotation.charAt(j + 1)) {
                    sc++;
                }
            }
            if(sc == k) ans++;
        }
        return ans;
    }
}