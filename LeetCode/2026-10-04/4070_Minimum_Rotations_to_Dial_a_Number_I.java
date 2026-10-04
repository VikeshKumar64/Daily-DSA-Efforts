class Solution {
    public int minRotations(String s) {
        int arr[] = new int[s.length()];
        int ans = 0;
        int j = 0;
        for(char c : s.toCharArray()){
            int curr = c - '0';
            arr[j] = curr;
            j++;
        }
        int from = 0;
        int too = 0;
        for(int i = 0;i < arr.length; i++){  
            from = i == 0 ? 0 : arr[i-1];
            too = arr[i];
            int dif = Math.abs(from - too);
            ans += Math.min(dif, 10 - dif);
            
        }
        return ans;
    }
}