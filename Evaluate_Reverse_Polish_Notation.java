

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(String c : tokens ) {
                if(c .equals("+")) {
                    stk.push(stk.pop()+stk.pop());
                }
                else if(c .equals("-")) {
                    int a = stk.pop();
                    int b = stk.pop();
                    stk.push(b-a);
                }
                else if(c .equals("*")) {
                    stk.push(stk.pop()*stk.pop());
                }
                else if(c .equals("/")){
                    int a = stk.pop();
                    int b = stk.pop();
                    stk.push(b/a);
                }
                else {
                    stk.push(Integer.valueOf(c));
                }
            
        }
        return stk.pop();  
    }
}
