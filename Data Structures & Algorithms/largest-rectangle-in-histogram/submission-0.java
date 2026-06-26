class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++){
            int pops = 0;
            while (!stack.empty() && stack.peek()[0] >= heights[i]){
                int[] val = stack.pop();
                maxArea = Math.max(val[0] * (val[1]+pops), maxArea);
                pops += val[1];
            }
            if (stack.empty() || stack.peek()[0] != heights[i]){
                stack.push(new int[]{heights[i], 1});
            }
            stack.peek()[1] += pops;
        }
        int pops = 0;
        while (!stack.empty()){
            int[] val = stack.pop();
            maxArea = Math.max(val[0] * (pops+val[1]), maxArea);
            pops+=val[1];
        }
        return maxArea;
    }
}
