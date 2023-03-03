package algorithm.every.week.samedifferences;


public class OptimizedVersion{

    public static void main(String[] args) {
        int[] a = {1, 3, 3, 4};
        int numberOfPairs = runAlgorithm(a);
        System.out.println(numberOfPairs);
    }

    private static int runAlgorithm(int[] a) {
        int count = 0;
        int [] occurrences = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int diff = a[i] - (i + 1);
            occurrences[diff]++;
        }

        for (int value : occurrences) {
            if (value > 1) {
                count += value;
            }
        }

        return (count * (count - 1)) >> 1;
    }
}
