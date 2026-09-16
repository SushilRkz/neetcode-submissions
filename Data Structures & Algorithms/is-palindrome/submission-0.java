class Solution {
    public boolean isPalindrome(String s) {
        if (s==null) {
            return false;
        }
        s = s.toLowerCase();
        char[] charArr = s.toCharArray();
        StringBuilder newSb = new StringBuilder();
        for (int i=0;i<charArr.length;i++) {
            if (Character.isLetter(charArr[i]) || Character.isDigit(charArr[i])) {
                newSb.append(charArr[i]);
            }
        }
        String newStr = new String(newSb);
        newSb.reverse();
        String revStr = new String(newSb);
        System.out.println(newStr);
        System.out.println(revStr);
        return newStr.equals(revStr);
    }
}
