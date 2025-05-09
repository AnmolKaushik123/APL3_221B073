// CrowAdapter.java
public class CrowAdapter extends Swan {
    private Crow crow;

    public CrowAdapter(Crow crow) {
        this.crow = crow;
    }

    @Override
    public void sound() {
        System.out.println("Crow is trying to sing like a swan...");
        crow.sound();
    }

    @Override
    public void move() {
        System.out.println("Crow is pretending to swim like a swan...");
        crow.move(); // Actually flying
    }

    @Override
    public void eat() {
        System.out.println("Crow is trying to eat like a swan...");
        crow.eat();
    }
}
