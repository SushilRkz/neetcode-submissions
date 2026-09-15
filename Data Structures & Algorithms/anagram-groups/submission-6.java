class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groupAnagramsMap = new HashMap<>();
        List<List<String>> resultMap = new ArrayList<>();
        List<String> anagramList = new ArrayList<>();
        for (String str:strs) {
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sortedStr = new String(strArr);
            anagramList.add(sortedStr);
        }

        for (int i=0;i<strs.length;i++) {
            String str = anagramList.get(i);
            if (!groupAnagramsMap.containsKey(str)) {
                groupAnagramsMap.put(str,new ArrayList<String>());
                groupAnagramsMap.get(str).add(strs[i]);
            } else {
                groupAnagramsMap.get(str).add(strs[i]);
            }

        }

        for (String key : groupAnagramsMap.keySet()) {
            resultMap.add(groupAnagramsMap.get(key));
        }
        return resultMap;
    }
}
