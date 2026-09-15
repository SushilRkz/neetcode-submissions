class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) {
            return 0;
        }
        Set<Integer> numsSet = new TreeSet<>();
        for (int i=0;i<nums.length;i++) {
            numsSet.add(nums[i]);
        }
        List<Integer> numsArr = new ArrayList<>(numsSet);
        int max=1;
        // System.out.println(numsArr);
        int tempMax = 1;
        for (int i=0;i<numsArr.size()-1;i++) {
            System.out.println(numsArr.get(i)+1==numsArr.get(i+1));
            if (numsArr.get(i)+1==numsArr.get(i+1)) {
                // System.out.println("temp:"+tempMax+"|max:"+max+"|numsArr[i]:"+numsArr.get(i)+"|numsArr[i+1]:"+numsArr.get(i+1));
                tempMax+=1;
            } else {
                // System.out.println("temp:"+tempMax+"|max:"+max+"|numsArr[i]:"+numsArr.get(i)+"|numsArr[i+1]:"+numsArr.get(i+1));
                tempMax=1;
            }
            if (tempMax>max) {
                max = tempMax;
            }
        }
        return max;
    }
}
