class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> indexMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            indexMap.putIfAbsent(nums[i], new ArrayList<>());
            indexMap.get(nums[i]).add(i);
        }

        int ans = Integer.MAX_VALUE;

        for(List<Integer> list: indexMap.values()){
            if(list.size() < 3) continue;

            for(int i = 0; i+2 < list.size(); i++){
                int a = list.get(i);
                int c = list.get(i+2);

                int dist = 2 * (c-a);
                ans = Math.min(ans,dist);
            }
        }
        return ans == Integer.MAX_VALUE ? -1:ans;
    }
}