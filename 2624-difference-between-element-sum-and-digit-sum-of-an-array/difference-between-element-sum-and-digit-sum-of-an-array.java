class Solution {

    public int Sum(int x){
        int sum = 0;
        while(x != 0){
            sum += x%10;
            x = x/10;
        }
        return sum;
    }

    public int differenceOfSum(int[] nums){
        int X = 0;
        int Y = 0;
        for(int i = 0 ; i < nums.length ; i++){
            X += nums[i];
            if(nums[i] < 10){
                Y += nums[i];
            }
            else{
                Y += Sum(nums[i]);
            }
        }
        return X-Y; 
    }
}