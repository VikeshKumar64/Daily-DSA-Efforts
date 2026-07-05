class Solution {
    public int maxDigitRange(int[] nums) {
        int sum = 0;
        int dR = -1;
        for(int i = 0; i < nums.length; i++){

            int num = nums[i];
            int tem = num;
            int l = 0;
            int s = 9;
            while(tem > 0){
                int rem = tem % 10;
                s = Math.min(s,rem);
                l = Math.max(l,rem);
                tem /= 10;
            }
            int r = l - s;
            if(r > dR){
                dR = r;
                sum = nums[i];
            }else if(r == dR){
                sum += nums[i];
            }
        }
        return sum;
    }
}