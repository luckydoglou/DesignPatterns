package main.java;

public class Node implements Composite {
    private String name = "node";
    
    private Node node1;
    private Node node2;
    
    private Leaf leaf1;
    private Leaf leaf2;
    
    /**
     * Constructor takes two nodes.
     * @param n1 node one
     * @param n2 node two
     * @param num the number of the node
     */
    public Node(Node n1, Node n2, int num) {
        node1 = n1;
        node2 = n2;
        leaf1 = null;
        leaf2 = null;
        name = name + num;
    }
    
    /**
     * Constructor takes one node and one leaf.
     * @param n1 node one
     * @param l2 leaf two
     * @param num the number of the node
     */
    public Node(Node n1, Leaf l2, int num) {
        node1 = n1;
        node2 = null;
        leaf1 = null;
        leaf2 = l2;
        name = name + num;
    }
    
    /**
     * Constructor takes two leaves.
     * @param l1 leaf one
     * @param l2 leaf two
     * @param num the number of the node
     */
    public Node(Leaf l1, Leaf l2, int num) {
        node1 = null;
        node2 = null;
        leaf1 = l1;
        leaf2 = l2;
        name = name + num;
    }
    
    /**
     * Print.
     */
    @Override
    public void print() {
        System.out.println(name);
        if (node1 != null) {
            node1.print();
        }
        if (node2 != null) {
            node2.print();
        }
        if (leaf1 != null) {
            leaf1.print();
        }
        if (leaf2 != null) {
            leaf2.print();
        }
    }
    
}
