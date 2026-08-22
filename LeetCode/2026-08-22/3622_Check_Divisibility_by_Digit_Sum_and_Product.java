class Solution {
    public boolean checkDivisibility(int n) {
     int newNum = n;
     int sum = 0;
     int prod = 1;
     while(n > 0){
        int rem = n % 10;
        sum += rem;
        prod *= rem;
        n /= 10;
     }   
     System.out.println(sum +" "+prod +" "+ sum+prod );
     return newNum % sum+prod == 0;
    }
}