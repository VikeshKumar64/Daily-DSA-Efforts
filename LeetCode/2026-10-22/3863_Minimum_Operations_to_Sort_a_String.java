class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int max = 0;
        int min = 27;
        boolean b = true;
        for(int i = 0; i < n-1; i++){
            if(s.charAt(i) <= s.charAt(i+1)){
                continue;
            }else{
                b = false;
                break;
            }
        }
         if(b){
            return 0;
        }else{
            for(int i = 0; i < n; i++){
                int curr = s.charAt(i) - 'a';
                max = Math.max(max, curr);
                min = Math.min(min, curr);
            }
        }
        if(n < 3) return -1;
       
        if(s.charAt(0) - 'a' == min || s.charAt(n-1) - 'a' == max) return 1;

        for(int i = 1; i < n-1; i++){
            if(s.charAt(i) - 'a' == max || s.charAt(i) - 'a' == min) return 2;
        }

        return 3;
        
    }
}