class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = friends.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(friends[i],i);
        }
        int ans[] = new int[n];
        int start = 0;
        for(int i = 0; i < order.length; i++){
            if(map.containsKey(order[i])){
                ans[start] = (order[i]);
                start++;
            }
        }
        return ans;
    }
}