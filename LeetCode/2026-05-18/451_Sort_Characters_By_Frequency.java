class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        Character[] arr = new Character[s.length()];

        for(int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        Arrays.sort(arr, (a, b) -> {
        if(freq[b] == freq[a]) {
            return a - b;
        }
        return freq[b] - freq[a];
        });

        StringBuilder sb = new StringBuilder();

        for(char ch : arr) {
            sb.append(ch);
        }
        return sb.toString();
    }
}