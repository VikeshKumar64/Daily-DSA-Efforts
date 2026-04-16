class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int ans[] = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int idx = queries[i];
            int val = nums[idx];
            List<Integer> list = map.get(val);

            if (list.size() == 1) {
                ans[i] = -1;
                continue;
            }
            int pos = Collections.binarySearch(list, idx);

            int left = (pos - 1 + list.size()) % list.size();
            int right = (pos + 1) % list.size();

            int d1 = Math.abs(list.get(left) - idx);
            d1 = Math.min(d1, n - d1);

            int d2 = Math.abs(list.get(right) - idx);
            d2 = Math.min(d2, n - d2);

            ans[i] = Math.min(d1, d2);
        }

        List<Integer> result = new ArrayList<>();
        for (int x : ans) result.add(x);

        return result;
    }
}