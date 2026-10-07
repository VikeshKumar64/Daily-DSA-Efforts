class Solution {
    public int countMaxOrSubsets(int[] nums) {
         Map<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 1);

        for (int num : nums) {
            Map<Integer, Integer> next = new HashMap<>(dp);

            for (Map.Entry<Integer, Integer> entry : dp.entrySet()) {
                int or = entry.getKey();
                int count = entry.getValue();

                int newOr = or | num;

                next.put(newOr, next.getOrDefault(newOr, 0) + count);
            }

            dp = next;
        }

        int maxOR = 0;

        for (int or : dp.keySet()) {
            maxOR = Math.max(maxOR, or);
        }

        return dp.get(maxOR);
    }
}