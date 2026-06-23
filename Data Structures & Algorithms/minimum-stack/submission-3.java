class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> prefix;
    public MinStack() {
        stack = new Stack<>();
        prefix = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (prefix.empty()){
            prefix.push(val);
        }
        else if (prefix.peek() > val){
            prefix.push(val);
        }
        else{
            prefix.push(prefix.peek());
        }
    }
    
    public void pop() {
        stack.pop();
        prefix.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return prefix.peek();
    }
}
