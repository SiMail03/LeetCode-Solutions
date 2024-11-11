class Solution {
    public int largestCombination(int[] candidates) {

        int maxlength=0;

        for(int bitPos = 0; bitPos < Integer.SIZE; bitPos++) {
            int currentlength = 0;
            int longestForSetBit = 0;

            int setBit = 1 << bitPos;

            for(int num : candidates) {
                if((num & setBit) !=0) {
                    currentlength++;
                    longestForSetBit = Math.max (longestForSetBit, currentlength);
                }


            }
            maxlength = Math.max (longestForSetBit, maxlength);
        }
            return maxlength;
    }
}