public class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int maxArea = 0;
        while (l<r) {
            int tempArea = (Math.min(heights[l],heights[r]))*(r-l);
            if (heights[l]<=heights[r]) {
                l++;
            } else {
                r--;
            }
            maxArea = Math.max(maxArea,tempArea);
        }
        return maxArea;
    }
}