class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        if(sum/k >= threshold) count++;
        int i = 1;
        int j = k;
        while(j < n){
            sum = sum - arr[i-1] + arr[j];
            if(sum/k >= threshold){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }
}