import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
        int [] result = new int[digits.length + 1];


        if(digits[digits.length-1]==10) {
            digits[digits.length-1] =0;
            for(int i = digits.length - 2; i >= 0; i--) {
                if(digits[i] == 9) {
                    digits[i] = 0;

                }
                else {
                    digits[i]++;
                    break;
                }

            }
            if(digits[0] == 0) {
                int[] arr = new int[]{1};

                System.arraycopy(arr, 0, result, 0, arr.length);
                System.arraycopy(digits, 0, result, 1, digits.length);
            return result;}

            }
        return digits;
        }
    }
