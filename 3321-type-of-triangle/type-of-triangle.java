class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        String result = "";
        if(nums[0] + nums[1] > nums[2]){
            if(nums[0] == nums[1] && nums[1] == nums[2]){
                result = "equilateral";
            }
            else if(nums[0] != nums[1] && nums[1] != nums[2]){
                result = "scalene";
            }
            else{
                result = "isosceles";
            }
        }
        else{
            result = "none";
        }
        return result;
    }
}