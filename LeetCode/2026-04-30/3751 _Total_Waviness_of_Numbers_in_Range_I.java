class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;

        for(int i = num1; i <= num2; i++){
            String s = String.valueOf(i);
            int count = 0;
            for(int j = 1; j < s.length() - 1; j++){
                int a = s.charAt(j);
                int b = s.charAt(j-1);
                int c = s.charAt(j+1);

                if((a > b && a > c) || (a < b && a < c)) count++;
            }
            ans += count;
        }
        return ans;
    }
}

// this Question i think can also be done using DP i will do it ,
//  currently my exams are going on otherwise i would have gave this question some more time