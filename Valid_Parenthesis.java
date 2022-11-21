class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char strChar = s.charAt(i);
            if(stack.empty()){
                stack.push(strChar);
            } else{
                char stkChar = (char) stack.peek();
                if(stkChar == '(' && strChar ==')' ){
                    stack.pop();
                } else if(stkChar == '{' && strChar=='}'){
                    stack.pop();
                } else if(stkChar == '[' && strChar == ']'){
                    stack.pop();
                } else{
                    stack.push(strChar);
                }
            }
        }
       return (stack.empty() ? true : false);
    }
}
