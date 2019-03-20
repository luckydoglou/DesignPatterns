
public class Main {

    public static void main(String[] args) {
        // Lets create a tree. Lets assume a node can have 1-2 nodes or leafs. 
        // We only want to allow the Node to have at most 2 "children"

        Leaf l1 = new Leaf(1);
        Leaf l2 = new Leaf(2);
        Leaf l3 = new Leaf(3);
        Leaf l4 = new Leaf(4);
        Leaf l5 = new Leaf(5);
        
        Node n1 = new Node(l1, l2,1);
        Node n2 = new Node(l3,l4,2);
        Node n3 = new Node(n1, l5,3);
        Node n4 = new Node(n2, n3,4);
        
        n4.print();
        
    }

}
