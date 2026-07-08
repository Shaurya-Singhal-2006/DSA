class Solution {
    public int[] moveZeros(int[] nums){
        int x = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                x = i;
                break;
            }
        }
        if(x == -1){
            return nums;
        }
        for(int j = x+1 ; j < nums.length ; j++){
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[x];
                nums[x] = temp;
                x++;
            }
        }
        return nums;
        
    }
    public int[] applyOperations(int[] nums) {
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1] == nums[i]){
                nums[i-1] *= 2;
                nums[i] = 0;
            }
        }
        return moveZeros(nums);
    }
}