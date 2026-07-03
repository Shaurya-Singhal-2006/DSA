class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int k = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[k] != val){
                count++;
                k++;
            }
            else{
                for(int j = k ; j < nums.length - 1 ; j++){
                    nums[j] = nums[j+1];
                }
            }
        }
        return count;
    }
}