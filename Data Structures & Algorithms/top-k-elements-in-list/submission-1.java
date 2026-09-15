class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (int i:nums) {
            resultMap.putIfAbsent(i,0);
            resultMap.put(i, resultMap.get(i)+1);
        }
        System.out.println(resultMap);
        int[] result = new int[k];
        List<Map.Entry<Integer,Integer>> reverseArr = new ArrayList<>(resultMap.entrySet());
        reverseArr.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int index=0;
        for(Map.Entry<Integer,Integer> entrySet : reverseArr) {
            result[index++]=entrySet.getKey();
            if (index==k){
                break;
            }
        }
        return result;
    }
}
