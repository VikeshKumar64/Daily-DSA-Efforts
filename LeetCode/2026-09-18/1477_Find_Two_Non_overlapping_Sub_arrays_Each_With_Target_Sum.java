class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;

        int i = 0;
        int j = 0;
        int currSum = 0;
        int minBest[] = new int[n];
        Arrays.fill(minBest, Integer.MAX_VALUE);

        int bestMinLen = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;

        while(j < n){
            currSum += arr[j];
            while(currSum > target){
                currSum -= arr[i];
                i++;
            }
            if(currSum == target){
                int len = j - i + 1;
                
                if(i > 0 && minBest[i-1] != Integer.MAX_VALUE){
                    res = Math.min(res, len + minBest[i-1]);
                }
                bestMinLen = Math.min(bestMinLen, len);
            }
            minBest[j] = bestMinLen;
            j++;
        }
        return res == Integer.MAX_VALUE ? -1 : res; 
    }
}