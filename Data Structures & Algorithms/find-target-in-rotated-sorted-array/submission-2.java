class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int min = 0;
        while (low <= high){
            if (nums[low] < nums[high]){
                if (nums[min] > nums[low]){
                    min = low;
                }
                break;
            }
            int mid = (low+high)/2;
            if (nums[min] > nums[mid]){
                min = mid;
            }
            if (nums[mid] >= nums[high]){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        
        low = 0;
        high = nums.length - 1;
        System.out.println("min: " + min);
        while (low <= high){
            int mid = (low + high)/2;
            int rotatedMid = (mid + min)%nums.length;
            System.out.println(mid + " " + rotatedMid);
            if (nums[rotatedMid] == target){
                return rotatedMid;
            }
            if (nums[rotatedMid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
