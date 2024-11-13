public class Main {
    public static void main (String[] args) {

        int [] nums = {0,0,1,1,1,2,2,3,3,4};

        Solution test = new Solution ();

        test.removeDuplicates (nums);


        for(int i=0; i<nums.length;i++) {
            System.out.print (nums[i]);
        }
    }
}