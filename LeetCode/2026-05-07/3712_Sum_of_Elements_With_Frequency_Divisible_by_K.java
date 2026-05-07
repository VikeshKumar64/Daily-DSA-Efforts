class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value % k == 0) sum = sum + (key * value);
        }
        return sum;
    }
}