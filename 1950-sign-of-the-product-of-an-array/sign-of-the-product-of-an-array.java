class Solution {

    public int signFunc(int zero , int neg){
        if(zero > 0) return 0;
        if(neg%2 != 0) return -1;
        return 1;
    }

    public int arraySign(int[] nums) {
        int negCount = 0;
        int zeroCount = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < 0){ 
                negCount++;
            }
            if(nums[i] == 0){
                zeroCount++;
            }
        }
        return signFunc(zeroCount , negCount);
    }
}