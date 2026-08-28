class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int ans[] = new int[n];

        for(int i = 0; i < n; i++){
            int j = 0;
            int sum = 0;
            while(j < n){
                if(boxes.charAt(j) == '1'){
                    sum += Math.abs(j-i);
                }
                j++;
            }
            ans[i] = sum;
        }
        return ans;
    }
}