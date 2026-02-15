class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int bulb : bulbs){
            map.put(bulb, map.getOrDefault(bulb,0)+1);
        }

        for(int key : map.keySet()) {
            int value = map.get(key);
            if(value % 2 != 0){
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}