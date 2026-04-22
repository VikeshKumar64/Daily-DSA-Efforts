class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val : nums){
            map.put(val, map.getOrDefault(val,0)+1);
        }

        ArrayList<Integer>[] buck = new ArrayList[nums.length + 1];

        for(int key : map.keySet()){
            int freq = map.get(key);

            if(buck[freq] == null){
                buck[freq] = new ArrayList<>();
            }
            buck[freq].add(key);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = buck.length - 1; i >= 0 && ans.size() < k; i--){
            if(buck[i] != null){
                for(int num : buck[i]){
                    ans.add(num);
                    if(ans.size() == k) break;
                }
            }
        }

        int res[] = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = ans.get(i);
        }

    return res;
    }
}

// This Question is Very Good , Needs to be done again