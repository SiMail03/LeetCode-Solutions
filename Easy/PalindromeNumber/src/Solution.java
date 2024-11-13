import java.lang.Math;

class Solution {
    public boolean isPalindrome(int x) {

        String num = Integer.toString(x);
        int i=0;
        int j= num.length()-1;

        if(x<0)
            return false;

        while(i < j)
        {
            if(num.charAt(i)!=num.charAt(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }


}