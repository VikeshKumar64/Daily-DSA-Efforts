class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for(int i = left;i <= right; i++){
            int num = i;
            int temp = i;
            boolean isValid = true;
            while (temp > 0) {
                int digit = temp % 10;

                // If digit is 0 OR not divisible
                if (digit == 0 || num % digit != 0) {
                    isValid = false;
                    break;
                }

                temp /= 10;
            }
            if (isValid) {
                result.add(i);
            }
        }
        return result;
    }
}