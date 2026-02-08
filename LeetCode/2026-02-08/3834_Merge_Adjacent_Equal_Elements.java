class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        int arr[] = nums;

        ArrayList<Long> st = new ArrayList<>();

        for(int x : arr){
            long val = x;

            while(!st.isEmpty() && st.get(st.size()-1) == val){
                val += st.remove(st.size() - 1);
            }
            st.add(val);
        }
        return st;
    }
}