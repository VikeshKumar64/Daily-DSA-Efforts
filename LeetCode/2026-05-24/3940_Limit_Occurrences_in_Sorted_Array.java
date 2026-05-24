class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();

        int count = 1;

        ans.add(nums[0]);

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if(count <= k) {
                ans.add(nums[i]);
            }
        }
        int[] res = new int[ans.size()];

        for(int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }
}