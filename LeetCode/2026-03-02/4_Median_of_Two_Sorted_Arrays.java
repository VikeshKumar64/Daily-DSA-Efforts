class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int i : nums1) numbersList.add(i);
        for (int i : nums2) numbersList.add(i);
        Collections.sort(numbersList);

        int totalLength = numbersList.size();
        if(totalLength % 2 != 0){
            return numbersList.get(totalLength / 2);
        }
        return (double)(numbersList.get(totalLength/2) + numbersList.get((totalLength/2)-1))/2;
    }
}