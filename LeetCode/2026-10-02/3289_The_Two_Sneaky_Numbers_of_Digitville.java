class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if (map.get(num) == 2) {
                list.add(num);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}