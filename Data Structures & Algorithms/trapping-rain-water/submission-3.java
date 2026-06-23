class Solution {
    public int trap(int[] height) {
        int[] pre = new int[height.length];
        int[] post = new int[height.length];
        int maxL = height[0];
        int maxR = height[height.length - 1];
        for (int i = 0; i < height.length; i++){
            if (height[i] >= maxL){
                maxL = height[i];
                pre[i] = 0;
            }
            else{
                pre[i] = maxL - height[i];
            }
            int ind = height.length - i - 1;
            if (height[ind] >= maxR){
                maxR = height[ind];
                post[ind] = 0;
            }
            else{
                post[ind] = maxR-height[ind];
            }
        }
        System.out.println(Arrays.toString(pre));
        System.out.println(Arrays.toString(post));
        int water = 0;
        for (int j = 0; j < height.length; j++){
            water += Math.min(pre[j], post[j]);
        }
        return water;
    }
}
