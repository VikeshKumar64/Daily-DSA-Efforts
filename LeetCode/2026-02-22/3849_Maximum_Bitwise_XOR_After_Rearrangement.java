class Solution {
    public String maximumXor(String s, String t) {
        String ExtraT = t;

        int c0 = 0, c1 = 0;
        for(char c : ExtraT.toCharArray()){
            if(c == '0') c0++;
            else c1++;
        }
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '0'){
                if(c1 > 0){
                    ans.append('1');
                    c1--;
                }else{
                    ans.append('0');
                    c0--;
                }
            }
            else{
                if(c0 > 0){
                    ans.append('1');
                    c0--;
                }else{
                    ans.append('0');
                    c1--;
                }
            }
        }
        return ans.toString();
    }
}