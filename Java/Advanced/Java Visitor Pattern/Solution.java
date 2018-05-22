import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {
    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {
    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {
    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getLeavesSum();

    public abstract void visitNode(TreeNode node);

    public abstract void visitLeaf(TreeLeaf leaf);
}

class SumInLeavesVisitor extends TreeVis {
    private int leavesSum = 0;

    public int getLeavesSum() {
        return leavesSum;
    }

    public void visitNode(TreeNode node) {
        //do nothing
    }

    public void visitLeaf(TreeLeaf leaf) {
        leavesSum += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long redNodesProduct = 1;
    private final int M = 1000000007; //10^9 + 7

    public int getLeavesSum() {
        return (int) redNodesProduct;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            redNodesProduct = (redNodesProduct * node.getValue()) % M;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            redNodesProduct = (redNodesProduct * leaf.getValue()) % M;
        }
    }
}

class FancyVisitor extends TreeVis {
    private int nonLeafEvenDepthSum = 0;
    private int greenLeavesSum = 0;

    public int getLeavesSum() {
        return Math.abs(nonLeafEvenDepthSum - greenLeavesSum);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            nonLeafEvenDepthSum += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            greenLeavesSum += leaf.getValue();
        }
    }
}

public class Solution {
    private static int[] values;
    private static Color[] colors;
    private static HashMap<Integer, HashSet<Integer>> nodesMap;

    public static Tree solve() {
        Scanner sc = new Scanner(System.in);
        int numNodes = sc.nextInt();

        values = new int[numNodes];
        for (int i = 0; i < numNodes; i++) {
            values[i] = sc.nextInt();
        }

        colors = new Color[numNodes];
        for (int i = 0; i < numNodes; i++) {
            colors[i] = sc.nextInt() == 0 ? Color.RED : Color.GREEN;
        }

        nodesMap = new HashMap<>(numNodes);
        for (int i = 0; i < numNodes - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            HashSet<Integer> uEdges = nodesMap.get(u);
            if (uEdges == null) {
                uEdges = new HashSet<>();
            }
            uEdges.add(v);
            nodesMap.put(u, uEdges);

            HashSet<Integer> vEdges = nodesMap.get(v);
            if (vEdges == null) {
                vEdges = new HashSet<>();
            }
            vEdges.add(u);
            nodesMap.put(v, vEdges);
        }
        sc.close();

        if (numNodes == 1) {
            return new TreeLeaf(values[0], colors[0], 0);
        }

        TreeNode root = new TreeNode(values[0], colors[0], 0);
        addChild(root, 1);
        return root;
    }

    private static void addChild(TreeNode parent, Integer parentId) {
        for (Integer treeNum : nodesMap.get(parentId)) {
            nodesMap.get(treeNum).remove(parentId);

            HashSet<Integer> edges = nodesMap.get(treeNum);
            Tree tree;
            if (edges != null && !edges.isEmpty()) {
                tree = new TreeNode(values[treeNum - 1], colors[treeNum - 1], parent.getDepth() + 1);
            } else {
                tree = new TreeLeaf(values[treeNum - 1], colors[treeNum - 1], parent.getDepth() + 1);
            }
            parent.addChild(tree);

            if (tree instanceof TreeNode) {
                addChild((TreeNode) tree, treeNum);
            }
        }
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getLeavesSum();
        int res2 = vis2.getLeavesSum();
        int res3 = vis3.getLeavesSum();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}