// Crow.java
public class Crow extends Animal {
    @Override
    public void sound() {
        System.out.println("Crow goes: Caw! Caw!");
    }

    @Override
    public void move() {
        System.out.println("Crow is flying high in the sky.");
    }

    @Override
    public void eat() {
        System.out.println("Crow is eating hastily.");
    }
}
