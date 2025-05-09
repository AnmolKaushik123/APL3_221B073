// AnimalAdapterDemo.java
public class AnimalAdapterDemo {
    public static void main(String[] args) {
        System.out.println("=== Real Swan ===");
        Animal swan = new Swan();
        swan.sound();
        swan.move();
        swan.eat();

        System.out.println("\n=== Real Crow ===");
        Animal crow = new Crow();
        crow.sound();
        crow.move();
        crow.eat();

        System.out.println("\n=== Crow Pretending to be Swan (Adapter) ===");
        Animal adaptedCrow = new CrowAdapter(new Crow());
        adaptedCrow.sound();
        adaptedCrow.move();
        adaptedCrow.eat();
    }
}
