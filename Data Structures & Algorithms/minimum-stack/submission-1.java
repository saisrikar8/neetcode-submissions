class MinStack {
    private Stack<Integer> stack;
    private List<Integer> prefix;
    public MinStack() {
        stack = new Stack<>();
        prefix = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (prefix.isEmpty()){
            prefix.add(val);
        }
        else if (prefix.get(prefix.size() - 1) > val){
            prefix.add(val);
        }
        else{
            prefix.add(prefix.get(prefix.size() - 1));
        }
    }
    
    public void pop() {
        stack.pop();
        prefix.remove(prefix.size() - 1);
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return prefix.get(prefix.size() - 1);
    }
}
