class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];
        for (int num : piles){
            high = Math.max(num, high);
        }
        int k = high;
        while (low <= high){
            int hours = 0;
            int mid = (low+high)/2;
            for (int pile : piles){
                hours += Math.ceil((double)pile/mid);
            }
            if (hours <= h){
                k = mid;
                high = k -1;
            }
            else {
                low = mid + 1;
            }
        }
        return k;
    }
}
