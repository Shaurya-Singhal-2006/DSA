class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sumL = 0;
        int sumR = 0;
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] result = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            leftSum[i] = sumL;
            sumL += nums[i];
        }

        for(int j = nums.length - 1 ; j >= 0 ; j--){
            rightSum[j] = sumR;
            sumR += nums[j];
        }

        for(int k = 0 ; k < nums.length ; k++ ){
            result[k] = Math.abs(leftSum[k] - rightSum[k]);
        }
        return result;
    }
}