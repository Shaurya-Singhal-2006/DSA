class Solution {
    public int maximumProduct(int[] nums) {
        // to hold the three largest positive value
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        // to hold the two highest negative values
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int num : nums){
            if(max1 < num){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if(max2 < num){
                max3 = max2;
                max2 = num;
            }
            else if(max3 < num){
                max3 = num;
            }

            if(min1 > num){
                min2 = min1;
                min1 = num;
            }
            else if(min2 > num ){
                min2 = num;
            }
        }
            int product1 = max1 * max2 * max3;
            int product2 = min1 * min2 * max1;
        return Math.max(product1 , product2);
    }
}