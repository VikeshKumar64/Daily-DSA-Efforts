class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : nums){
            ArrayList<Integer> single = new ArrayList<>();

            while(num > 0){
                int rem = num % 10;
                single.add(rem);
                num /= 10;
            }
            Collections.reverse(single);
            result.addAll(single);
        }
        int ans[] = new int[result.size()]; 

        for(int i = 0; i < result.size(); i++){
            ans[i] = result.get(i); 
        }
        return ans;
    }
}