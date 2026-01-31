class Solution {
    public String reverseByType(String s) {
        char[] letters = new char[s.length()];
        char[] special = new char[s.length()];
        int l = 0, sp = 0;

        for(char ch : s.toCharArray()){
            if(Character.isLowerCase(ch)){
                letters[l++] = ch;
            }else{
                special[sp++] = ch;
            }
        }

        StringBuilder ans = new StringBuilder();
        l--;
        sp--;

        for(char ch : s.toCharArray()){
            if(Character.isLowerCase(ch)){
                ans.append(letters[l--]);
            }else{
                ans.append(special[sp--]);
            }
        }
        
        return ans.toString();

    }
}