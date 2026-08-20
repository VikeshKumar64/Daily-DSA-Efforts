class Solution {
    public int[] resultArray(int[] nums) {
        int a = nums[0];
        int count = 1;
        ArrayList<Integer> list2 = new ArrayList<>();
        int ans[] = new int[nums.length];
        ans[0] = nums[0];
        list2.add(nums[1]);
        for(int i = 2; i <nums.length; i++){
            if(a > list2.get(list2.size()-1)){
                ans[count] = nums[i];
                count++;
                a = nums[i];
            }else{
                list2.add(nums[i]);
            }
        }
        for(int i = 0; i < list2.size(); i++){
            ans[count] = list2.get(i);
            count++;
        }
        return ans;
    }
}