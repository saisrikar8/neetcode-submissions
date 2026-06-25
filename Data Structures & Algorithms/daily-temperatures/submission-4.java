class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++){
            while (!stack.empty() && temperatures[i] > stack.peek()[0]){
                result[stack.peek()[1]] = i - stack.pop()[1];
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return result;
    }
}
