class Solution {
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(isVowel(ch)) {
                vowels.add(ch);
            }
        }
        Collections.sort(vowels);

        char[] arr = s.toCharArray();


        int idx = 0;

        for(int i = 0; i < arr.length; i++) {

            if(isVowel(arr[i])) {
                arr[i] = vowels.get(idx++);
            }
        }

        return new String(arr);
    }
}