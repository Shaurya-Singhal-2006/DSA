class Solution {
    public void moveZeroes(int[] nums) {
        int x = -1;
        // this is to bring x to the first 0th index;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                x = i;
                break;
            }
        }
        // if there are no zeros
        if(x == -1){
            return;
        }
        for(int j = x+1 ; j < nums.length ; j++){
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[x];
                nums[x] = temp;
                x++;
            }
        }
    }
}