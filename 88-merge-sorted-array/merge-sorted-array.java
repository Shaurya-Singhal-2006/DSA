class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m+n - 1;
        int y = m-1;
        int z = n-1;
        while(y>=0 && z >= 0){
            if(nums1[y] > nums2[z]){
                nums1[x] = nums1[y];
                y--;
                x--;
            }
            else{
                nums1[x] = nums2[z];
                x--;
                z--;
            }
        }
        while(z>=0){
            nums1[z] = nums2[x];
            z--;
            x--;
        }
    }
}