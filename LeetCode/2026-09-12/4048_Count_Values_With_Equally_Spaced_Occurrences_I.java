class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];

            if (!map.containsKey(x)) {
                map.put(x, new int[]{1, i, -1});
            } else {
                int[] a = map.get(x);

                if (a[0] == 1) {
                    a[2] = i - a[1];
                } else if (a[0] == 2) {
                    if (i - a[1] != 2 * a[2]) {
                        a[2] = -1;
                    }
                }

                a[0]++;
            }
        }

        int ans = 0;

        for (int[] a : map.values()) {
            if (a[0] == 3 && a[2] != -1) {
                ans++;
            }
        }

        return ans;
    }
}