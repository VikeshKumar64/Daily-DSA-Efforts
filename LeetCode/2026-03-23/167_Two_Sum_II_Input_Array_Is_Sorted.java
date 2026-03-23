class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j = numbers.length-1;
        int i = 0;

            while(i < j){
                if(numbers[j] + numbers[i] == target){
                    return new int[]{i+1,j+1};
                }

                if(numbers[j] + numbers[i] > target){
                    j--;
                }
                if(numbers[j] + numbers[i] < target){
                    i++;
                }
            }
        return new int[]{0,0};
    }
}