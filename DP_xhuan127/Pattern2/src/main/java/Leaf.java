package main.java;

public class Leaf implements Composite {
    int number;
    String name = "leaf";
    
    public Leaf(int number) {
        this.number = number;
        name = name + number;
    }
    
    @Override
    public void print() {
        System.out.println(name);
    }

}
