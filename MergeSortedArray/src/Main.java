public class Main {
    public static void main (String[] args) {

        int[] arr1 = new int[] {2,0};
        int m = 1;
        int[] arr2 = new int[] {1};
        int n = 1;
        Solution test = new Solution ();
        test.merge (arr1, m, arr2, n);

        for(int i=0; i<arr1.length;i++)
            System.out.print (arr1[i]);


    }

}