class Solution {
    public List<Integer> findGoodIntegers(int n) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int Lim = (int)Math.cbrt(n);
        for(int i = 1; i <= Lim; i++){
            for(int j = i; j <= Lim; j++){
                long ans = (long)i*i*i + (long)j*j*j;
                if(ans > n) continue;
                map.put((int)ans,map.getOrDefault((int)ans,0)+1);
            }
        }
        List<Integer> Final = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) >= 2) {
                Final.add(key);
            }
        }
        Collections.sort(Final);
        return Final;
    }
}