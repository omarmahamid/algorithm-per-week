package algorithm.every.week.sumrange;

public class MainRangeQuery{

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        DynamicSegmentTree.Node rootNode = DynamicSegmentTree.buildTree(arr, 0, arr.length - 1);

        DynamicSegmentTree dynamicSegmentTree = new DynamicSegmentTree(rootNode);

        int sum = dynamicSegmentTree.query(0, arr.length - 1);

        System.out.println(sum);

    }
}
