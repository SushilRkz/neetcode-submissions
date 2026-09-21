public class Solution {
    public int trap(int[] height) {
        if (height.length<=1) {
            return 0;
        }
        int[] rightArr = new int[height.length];
        int[] leftArr = new int[height.length];
        leftArr[0]=height[0];
        for (int i=1;i<height.length;i++) {
            leftArr[i]=Math.max(leftArr[i-1],height[i]);
        }
        rightArr[height.length-1] = height[height.length-1];
        for (int i=height.length-2;i>=0;i--) {
            rightArr[i]=Math.max(rightArr[i+1],height[i]);
        }
        int maxVol = 0;
        for (int i=0;i<height.length;i++) {
            maxVol+=Math.min(leftArr[i],rightArr[i])-height[i];
        }
        return maxVol;
    }
}