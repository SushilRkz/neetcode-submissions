class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArr = s.toCharArray();
        for (int i=0;i<charArr.length;i++) {
            if (charArr[i]=='{'||charArr[i]=='['||charArr[i]=='(') {
                stack.push(charArr[i]);
            } else {
                if (!stack.isEmpty() && ((stack.peek().equals('{') && charArr[i]=='}') ||
                (stack.peek().equals('(') && charArr[i]==')') || 
                (stack.peek().equals('[') && charArr[i]==']'))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
