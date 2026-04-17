class Solution {
    public int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                ans = Math.min(ans, i - map.get(nums[i]));
            }

            int rev = reverseNumber(nums[i]);
            map.put(rev, i);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
// in this question we have to store the reverse part in the hashmap and then compare with the array.