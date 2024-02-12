package Circus.Animal;

public abstract class Bird extends Animal {
    public void fly() {
        System.out.println("Whee ...");
    }

    @Override
    public String speak() {
        return "asdasdas";
    }
}
