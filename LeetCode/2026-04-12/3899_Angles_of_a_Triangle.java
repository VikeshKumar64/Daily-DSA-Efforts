class Solution {
    public double[] internalAngles(int[] sides) {
        int n = sides.length;
        double[] ans = new double[n]; 
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];
        
        if (a + b <= c || b + c <= a || a + c <= b) {
            return new double[0];
        }

        double x = Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2*b*c)));
        double y = Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2*a*c)));
        double z = Math.toDegrees(Math.acos((a*a + b*b - c*c) / (2*a*b)));
        ans[0] = x;
        ans[1] = y;
        ans[2] = z;
        Arrays.sort(ans);
        return ans;
    }
}