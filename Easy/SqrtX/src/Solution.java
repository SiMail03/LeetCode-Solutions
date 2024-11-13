
class Solution {
    public int mySqrt(int x) {

        double r = x;
        double epsilon = 1e-6; // Small threshold for comparison

        while (Math.abs(r * r - x) > epsilon) {
            r = (r + x / r) / 2;
        }
        return (int) r;
    }
}