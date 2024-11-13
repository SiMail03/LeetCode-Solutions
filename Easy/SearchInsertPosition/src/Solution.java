class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;

        if(target < nums[0])
            return 0;

        if(target > nums[nums.length-1])
            return nums.length;


        while(l<=r) {
            int mid=(l+r)/2;
            if(target<nums[mid]) {
                r=mid-1;
            }
            else if(target>nums[mid]) {
                l=mid+1;

            }
            else if(target == nums[mid]) {
                return mid;

            }




            if (target > nums[mid] && target <nums[mid+1]) {
                return mid+1;
            }

            if( target < nums[mid] && target > nums[mid-1]) {
                return mid;
            }





        }
        return nums.length;
    }
}