/**
 * 
 */

package main.java;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This class test the functionalities of the program.
 * @author Lor
 *
 */
public class UnitTest {

    // variable declaration
    Leaf l1;
    Leaf l2;
    Leaf l3;
    Leaf l4;
    Leaf l5;
    
    Node n1;
    Node n2;
    Node n3;
    Node n4;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }


    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * This method initialize necessary variables.
     * @throws java.lang.Exception exception to catch
     */
    @Before
    public void setUp() throws Exception {
        // Lets create a tree. Lets assume a node can have 1-2 nodes or leafs. 
        // We only want to allow the Node to have at most 2 "children"
        l1 = new Leaf(1);
        l2 = new Leaf(2);
        l3 = new Leaf(3);
        l4 = new Leaf(4);
        l5 = new Leaf(5);
        
        n1 = new Node(l1, l2,1);
        n2 = new Node(l3,l4,2);
        n3 = new Node(n1, l5,3);
        n4 = new Node(n2, n3,4);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {

    }

}
