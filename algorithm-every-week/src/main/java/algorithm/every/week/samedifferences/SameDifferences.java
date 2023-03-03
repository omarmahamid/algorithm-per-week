package algorithm.every.week.samedifferences;

import java.util.HashMap;
import java.util.Map;

public class SameDifferences {

    public static void main(String[] args) {
        int[] a = {1, 3, 3, 4};
        int numberOfPairs = runAlgorithm(a);
        System.out.println(numberOfPairs);
    }

    private static int runAlgorithm(int[] a) {
        int count = 0;
        Map<Integer, Integer> occurrencesMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int diff = a[i] - (i + 1);
            occurrencesMap.put(diff, occurrencesMap.getOrDefault(diff, 0) + 1);
        }

        for (int value : occurrencesMap.values()) {
            if (value > 1) {
                count += value * (value - 1) / 2;
            }
        }

        return count;
    }
}
