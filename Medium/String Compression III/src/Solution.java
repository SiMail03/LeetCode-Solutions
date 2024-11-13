public class Solution {

    public String compressedString(String word) {
        String comp = new String ();
        int count = 1;

        for(int i=1; i<word.length (); i++) {

                if (word.charAt (i) == word.charAt (i-1) && count < 9) {
                    count++;
                } else {
                    comp = comp + count + word.charAt (i-1);
                    count = 1;
                }

        }
        comp = comp + count + word.charAt(word.length() - 1);

        return comp;
    }
}
