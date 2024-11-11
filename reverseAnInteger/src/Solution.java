import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Solution {
    public int reverse(int x) {


        long output = 0;
        boolean negative = false;
        if(x<0) {
            negative = true;
            x = x- (x*2);
        }
        int i=1;
        while(x!=0) {
            int temp;
            temp = x % 10;
            output = output * 10 + temp;
            x = x/10;
            i = i*10;
        }

        if(negative == true) {
            output = 0-output;
        }

        if (output > Integer.MAX_VALUE || output < Integer.MIN_VALUE)
            return 0;

        return (int) output;    }
}