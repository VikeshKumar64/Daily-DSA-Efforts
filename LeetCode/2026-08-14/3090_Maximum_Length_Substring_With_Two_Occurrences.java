class Solution {
    public int maximumLengthSubstring(String s) {
        int arr[] = new int[26];

        int i = 0;
        int j = 0;
        int n = s.length();
        int max = 0;
        while(j < n){
            arr[s.charAt(j) - 'a']++;
            while(arr[s.charAt(j) - 'a'] > 2){
                arr[s.charAt(i) - 'a']--;
                i++;
            }
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}