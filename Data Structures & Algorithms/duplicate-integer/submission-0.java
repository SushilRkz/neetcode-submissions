class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dupSet = new HashSet<>();
        for (int i:nums) {
            if (dupSet.contains(i)) {
                return true;
            } else {
                dupSet.add(i);
            }
        }
        return false;
    }
}