class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;

        Arrays.sort(tokens);

        int i = 0;
        int j = n - 1;

        int score = 0;
        int ans = 0;

        while (i <= j) {

            // Face-up: use the smallest token
            if (power >= tokens[i]) {
                power -= tokens[i];
                score++;

                ans = Math.max(ans, score);

                i++;
            }

            // Face-down: use the largest token
            else if (score > 0 && i < j) {
                power += tokens[j];
                score--;

                j--;
            }

            else {
                break;
            }
        }

        return ans;
    }
}