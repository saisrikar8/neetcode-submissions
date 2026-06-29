class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        int low = 0;
        int high = nums.length - 1;
        while (low <= high){
            if (nums[low] < nums[high]){
                return Math.min(min, nums[low]);
            }
            int mid = low + (high - low)/2;
            min = Math.min(min, nums[mid]);
            if (nums[mid] >= nums[low]){
                low = mid+1;
            }
            else {
                high = mid - 1;
            }
        }
        return min;
    }
}
