public class Main {
    public static void main (String[] args) {

Solution test = new Solution ();

    int [] nums = {-1, -1, 1, 1};
        int [] solution = test.twoSum (nums, -2);

        for (int i= 0; i<solution.length; i++) {
            System.out.println (solution[i]);
        }

    }
}