class Solution {
    public boolean primeOrNot(int n){
        if(n <= 1) return false;
        if(n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    public int minOperations(int[] nums) {
        int opr = 0;
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            if(i % 2 == 0){
                if(primeOrNot(nums[i])) continue;
                else{
                    while(!primeOrNot(cur)){
                        cur++;
                        opr++;
                    }
                }
            }else{
                if(!primeOrNot(nums[i])) continue;
                else{
                    while(primeOrNot(cur)){
                        cur++;
                        opr++;
                    }
                }
            }
        }
        return opr;
    }
}