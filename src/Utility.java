
public class Utility {

    /** Get max of array sequence from starting (inclusive) to ending (exclusive) */
    public static int arrayMax(int[] arr, int starting, int ending) {
        int ans = 0;
        for (int i = starting;  i < ending;  i++) {
            ans = Math.max(ans, arr[i]);
        }
        return ans;
    }

    public static class IntDoublePair {

        public int first;
        public double second;

        public IntDoublePair(int first, double second) {
            this.first = first;
            this.second = second;
        }

        public boolean biggerThan(IntDoublePair other) {
            return first > other.first || (first == other.first && second > other.second);
        }
    }
}
