package algorithm.every.week.sumrange;

public class MainRangeQuery{


    private static int naiveApproach(int [] arr){

        Approach naiveApproach = new NaiveApproach(arr);

        return naiveApproach.query(0, arr.length - 1);

    }

    private static int dynamicSegmentTreeApproach(int [] arr, DynamicSegmentTree.Node rootNode){

        Approach dynamicSegmentTree = new DynamicSegmentTree(rootNode);

        return dynamicSegmentTree.query(0, arr.length - 1);
    }

    public static void main(String[] args) {

        int[] arr = new int[1000004];

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        long startNaiveApproach = System.currentTimeMillis();
        int sumNaiveApproach = naiveApproach(arr);
        System.out.println(sumNaiveApproach);
        System.out.println("Naive approach time : " + (System.currentTimeMillis() - startNaiveApproach));

        // let's build the tree
        DynamicSegmentTree.Node rootNode = DynamicSegmentTree.buildTree(arr, 0, arr.length - 1);

        long startDynamicApproach = System.currentTimeMillis();
        int sumDynamicApproach = dynamicSegmentTreeApproach(arr, rootNode);
        System.out.println(sumDynamicApproach);
        System.out.println("Dynamic Segment Tree approach time : " + (System.currentTimeMillis() - startDynamicApproach));


    }
}
