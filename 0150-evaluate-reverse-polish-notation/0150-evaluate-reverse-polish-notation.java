class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();
       
        
        for(String token : tokens){
           if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){

                int b = stack.pop();
                int a = stack.pop();
                 int res =0;

               if (token.equals("+")) {
                    res = a + b;
                } else if (token.equals("-")) {
                    res = a - b;
                } else if (token.equals("*")) {
                    res = a * b;
                } else if (token.equals("/")) {
                    res = a / b;
                }
                 stack.push(res);

            } else {
                // number
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
        
    }
}