class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        for(int num : nums){
            if(max1 < num){
                max2 = max1;
                max1 = num;
            }
            // this condition only runs if the number is lower than or equal to the max1
            else if (max2 <= num){
                max2 = num;
            }
        }
        return (max1-1)*(max2-1);
    }
}