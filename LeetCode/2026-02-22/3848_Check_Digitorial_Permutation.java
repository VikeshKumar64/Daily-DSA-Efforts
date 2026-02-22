class Solution {
    public int fact(int n){
        if(n == 1 || n == 0) return 1;
        return n*fact(n-1);
    }
    public boolean isDigitorialPermutation(int n) {
        int orig = n;
        int num = n;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum += fact(rem);
            num = num / 10;
        }
        char arr1[] = String.valueOf(orig).toCharArray();
        char arr2[] = String.valueOf(sum).toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}