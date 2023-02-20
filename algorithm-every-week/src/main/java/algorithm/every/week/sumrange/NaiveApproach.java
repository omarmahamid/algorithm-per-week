package algorithm.every.week.sumrange;

public class NaiveApproach implements Approach{

    int[] arr;

    public NaiveApproach(int[] arr) {
        this.arr = arr;
    }


    @Override
    public void update(int index, int val) {
        this.arr[index] = val;
    }

    @Override
    public int query(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
