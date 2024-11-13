class Solution {
    public boolean canSortArray(int[] nums) {


        nums = sort (nums, nums.length);

        for(int i=1; i<nums.length; i++) {
            if(nums[i] < nums[i-1])
                return false;

        }

        return true;

    }

    public String [] intToBinary (int [] num) {
        String[] binary = new String[num.length];
        for (int i = 0; i < num.length; i++) {
            binary[i] = Integer.toBinaryString (num[i]);

        }

        return binary;
    }
    public int[] sort (int [] nums, int n) {
        String [] binary = intToBinary (nums);
        n = nums.length;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1] && countSetBit(binary[j]) == countSetBit(binary[j+1])) {

                    // Swap nums[j] and nums[j+1]
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }



            }

            // If no two elements were
            // swapped by inner loop, then break

        }
        return nums;
    }

    public int countSetBit(String str)
    {
        int count = 0;

        for(int i=0; i < str.length(); i++)
        {    if(str.charAt(i) == '1')
            count++;
        }

        return count;
    }}