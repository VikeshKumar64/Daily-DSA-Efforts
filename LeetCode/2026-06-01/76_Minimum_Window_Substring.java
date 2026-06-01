class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            char c = t.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int l = 0;
        int minLen = Integer.MAX_VALUE;
        int startI = -1;
        int count = 0;
        for(int r = 0; r < m; r++){
            char ch = s.charAt(r);

            if(map.containsKey(ch)){
                if(map.get(ch) > 0) count++;

                map.put(ch, map.get(ch) - 1);
            }
            
            while(count == n) {
                if(r - l + 1 < minLen){
                    minLen = r-l + 1;
                    startI = l;
                }
                char left = s.charAt(l);

                if (map.containsKey(left)) {

                    map.put(left, map.get(left) + 1);

                    if (map.get(left) > 0)
                        count--;
                }
                l++;
            }
        }
        return startI == -1 ? "" : s.substring(startI,startI+minLen);
    }
}