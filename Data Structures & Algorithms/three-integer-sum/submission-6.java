class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && nums[i] <= 0; i++){
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = nums.length - 1;
            while (l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if (sum < 0){
                    l++;
                }
                else if (sum > 0){
                    r--;
                }
                else if (sum==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    res.add(temp);
                    l++;
                    r--;
                    while (nums[l] == nums[l-1] && l < r){
                        l++;
                    }
                }
            }
        }
        return res;
    }
}
