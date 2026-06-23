class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 1){
            return Integer.parseInt(tokens[0]);
        }
        Stack<Integer> stack = new Stack<>();
        int eval = 0;
        for (int i = 0; i < tokens.length; i++){
            if (tokens[i].equals("+")){
                int sum = stack.pop() + stack.pop();
                eval= sum;
                stack.push(sum);
            }
            else if (tokens[i].equals("-")){
                int second = stack.pop();
                int first = stack.pop();
                int dif = first - second;
                eval= dif;
                stack.push(dif);
            }
            else if (tokens[i].equals("*")){
                int mult = stack.pop() * stack.pop();
                eval= mult;
                stack.push(mult);
            }
            else if (tokens[i].equals("/")){
                int second = stack.pop();
                int first = stack.pop();
                int div = first / second;
                eval= div;
                stack.push(div);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return eval;
    }
}
