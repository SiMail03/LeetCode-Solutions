class Solution {

    public static int value (char c) {

        if(c == 'M')
            return 1000;

        if (c == 'D')
            return 500;

        if(c == 'C')
            return 100;

        if(c == 'L')
            return 50;

        if(c == 'X')
            return 10;

        if(c == 'V')
            return 5;

        if(c == 'I')
            return 1;

        return -1;
    }
    public int romanToInt(String s) {

        String str = s;
        int output = 0;
      for(int i=0; i<s.length (); i++) {
          int temp1 = value(str.charAt (i));

          if(i+1 < str.length ()) {
              int temp2 = value (str.charAt (i+1));

              if(temp1<temp2) {
                    output += (temp2-temp1);
                  i++;

              }
              else {
                  output+= temp1;
              }
          }
          else {
              output += temp1;
          }


      }
        return output;
    }


}