package algorithm.every.week.sumrange;

public class DynamicSegmentTree{

    Node root;

    public DynamicSegmentTree(Node root){
        this.root = root;
    }

    public static Node buildTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.sum = arr[start];
            return leaf;
        }

        int mid = (start + end) / 2;
        Node left = buildTree(arr, start, mid);
        Node right = buildTree(arr, mid+1, end);

        Node parent = new Node(start, end);
        parent.left = left;
        parent.right = right;
        parent.sum = left.sum + right.sum;

        return parent;
    }



    public void update(int index, int val) {
        root = update(root, index, val);
    }

    private Node update(Node node, int index, int val) {
        if (node == null) {
            node = new Node(index, index);
            node.sum = val;
        } else if (node.start == index && node.end == index) {
            node.sum = val;
        } else {
            int mid = (node.start + node.end) / 2;
            if (index <= mid) {
                node.left = update(node.left, index, val);
            } else {
                node.right = update(node.right, index, val);
            }
            node.sum = (node.left != null ? node.left.sum : 0)
                    + (node.right != null ? node.right.sum : 0);
        }
        return node;
    }

    public int query(int start, int end) {
        return query(root, start, end);
    }

    private int query(Node node, int start, int end) {
        if (node == null || node.start > end || node.end < start) {
            return 0;
        } else if (node.start >= start && node.end <= end) {
            return node.sum;
        } else {
            return query(node.left, start, end) + query(node.right, start, end);
        }
    }

    static class Node{
        int start;
        int end;
        int sum;
        Node left;
        Node right;

        Node(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
