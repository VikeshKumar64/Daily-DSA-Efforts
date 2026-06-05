class Solution {
    public int minimumFlips(int n) {
        String b = Integer.toBinaryString(n);

        String r = new StringBuilder(b).reverse().toString();

        int flips = 0;

        for(int i = 0; i < b.length(); i++){
            if(b.charAt(i) != r.charAt(i)) flips++;
            else continue;
        }
    return flips;
    }
}