
public class Leaf {
    int number;
    String name = "leaf";
    
    public Leaf(int number) {
        this.number = number;
        name = name + number;
    }
    
    public void print() {
        System.out.println(name);
    }

}
