class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {


        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();

        for (int i : nums1) {
            set.add(i);
        }
        for (int j : nums2) {
            if (set.contains(j)) {
                intersect.add(j);
            }
        }
        int n = intersect.size();
        int[] result = new int [n];
        int index = 0;

        for(int i: intersect){
            result[index++] = i;
        }

        return result;

    }
}