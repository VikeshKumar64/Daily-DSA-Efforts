class Solution {
    public static boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n <= 3) return true;
    
    if (n % 2 == 0 || n % 3 == 0) return false;

    for (long i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) {
            return false;
        }
    }
        return true;
    }
    public int reverse(int num) {
    int reversed = 0;
    while (num != 0) {
        reversed = reversed * 10 + (num % 10);
        num /= 10;
    }
    return reversed;
}
    public int sumOfPrimesInRange(int n) {
        int num = n;
        int rev = reverse(n);
        int sum = 0;
        if(num > rev){
            for(int i = rev; i <= num; i++){
                if(isPrime(i)) sum += i;
            }
        }else{
            for(int i = num; i <= rev; i++){
                if(isPrime(i)) sum += i;
            }
        }
        return sum;
    }
}