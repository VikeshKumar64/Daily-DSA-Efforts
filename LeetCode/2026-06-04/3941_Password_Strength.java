class Solution {
    public int passwordStrength(String password) {
        int stren = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if(set.add(c)){
                if(c >= 'A' && c  <= 'Z'){
                stren += 2;
            }else if(c >= 'a' && c  <= 'z' ){
                stren += 1;
            }else if(c >='0' && c  <= '9'){
                stren += 3;
            }else{
                stren += 5;
            }
            }
        }
        return stren;
    }
}