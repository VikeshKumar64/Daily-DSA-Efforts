class Solution {
    public int minAddToMakeValid(String s) {
        int b = 0;
        int add = 0;

        for(char ch : s.toCharArray()){
            if(ch == '(') b++;
            else{
                if(b > 0)b--;
                else add++;
            }
        }
        return add + b;
    }
}