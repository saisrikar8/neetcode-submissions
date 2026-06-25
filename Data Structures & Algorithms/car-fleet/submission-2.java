class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int j = 0; j < position.length; j++){
            hash.put(position[j], speed[j]);
        }
        Arrays.sort(position);
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < position.length; i++){
            double time = (double)(target-position[i])/(hash.get(position[i]));
            while (!stack.empty() && stack.peek() <= time){
                stack.pop();
            }
            stack.push(time);
        } 
        return stack.size();
    }
}
