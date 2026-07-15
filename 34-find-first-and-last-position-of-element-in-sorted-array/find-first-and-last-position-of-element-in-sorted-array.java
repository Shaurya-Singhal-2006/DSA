class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int last = -1;
        int[] result = new int[2];
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                if(start == -1){
                    start = i;
                }
                last = i;
            }
        }
        result[0] = start;
        result[1] = last;
        return result; 
    }
}