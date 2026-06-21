class Solution {
    public int first(long num){
        String st = Long.toString(num);
        return (st.charAt(0) - '0');
    }
    public int last(long num){
        return (int)(num % 10);
    }
    public int countValidSubarrays(int[] nums, int x) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            long sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(first(sum) == last(sum) && first(sum) == x) ans++;
            }
        }
        return ans;
    }
}