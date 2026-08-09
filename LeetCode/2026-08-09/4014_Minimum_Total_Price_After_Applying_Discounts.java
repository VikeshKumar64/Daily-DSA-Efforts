class Solution {
    public double per(int p, int d){
        return (p * (100-d))/100.0;
    }
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double sum = 0;
        int n = prices.length;
        int m = discounts.length;
        
        for(int i = 0; i < Math.min(n, m); i++){
            sum += per(prices[n-i-1],discounts[m-i-1]);
        }
        for (int i = 0; i < n - m; i++) {
            sum += prices[i];
        }
        return sum;
    }
}