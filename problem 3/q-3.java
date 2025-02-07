
interface Flyable {
    void fly();
}

interface Quackable {
    void quack();
}

interface Squeakable {
    void squeak();
}

interface Muteable {
    void mute();
}

interface Swimmable {
    void swim();
}

class Duck implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Duck is swimming!");
    }
}


class RubberDuck extends Duck implements Squeakable, Swimmable {
    @Override
    public void squeak() {
        System.out.println("RubberDuck squeaks!");
    }

    @Override
    public void swim() {
        super.swim(); // All ducks swim
    }
}

// WoodenDuck doesn't fly, doesn't quack, but is mute and swims
class WoodenDuck extends Duck implements Muteable, Swimmable {
    @Override
    public void mute() {
        System.out.println("WoodenDuck is mute!");
    }

    @Override
    public void swim() {
        super.swim(); // All ducks swim
    }
}

// RedHeadDuck can fly, quack, and swim
class RedHeadDuck extends Duck implements Flyable, Quackable, Swimmable {
    @Override
    public void fly() {
        System.out.println("RedHeadDuck is flying!");
    }

    @Override
    public void quack() {
        System.out.println("RedHeadDuck is quacking!");
    }

    @Override
    public void swim() {
        super.swim(); // All ducks swim
    }
}

// LakeDuck can fly, quack, and swim
class LakeDuck extends Duck implements Flyable, Quackable, Swimmable {
    @Override
    public void fly() {
        System.out.println("LakeDuck is flying!");
    }

    @Override
    public void quack() {
        System.out.println("LakeDuck is quacking!");
    }

    @Override
    public void swim() {
        super.swim(); // All ducks swim
    }
}

// Step 4: Main class to test the duck behaviors
public class DuckSimulator {
    public static void main(String[] args) {
        // Create different duck instances
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        // Test RubberDuck
        System.out.println("Testing RubberDuck:");
        rubberDuck.swim(); // RubberDuck can swim
        ((Squeakable) rubberDuck).squeak(); // RubberDuck squeaks

        // Test WoodenDuck
        System.out.println("\nTesting WoodenDuck:");
        woodenDuck.swim(); // WoodenDuck can swim
        ((Muteable) woodenDuck).mute(); // WoodenDuck is mute

        // Test RedHeadDuck
        System.out.println("\nTesting RedHeadDuck:");
        redHeadDuck.swim(); // RedHeadDuck can swim
        ((Flyable) redHeadDuck).fly(); // RedHeadDuck can fly
        ((Quackable) redHeadDuck).quack(); // RedHeadDuck can quack

        // Test LakeDuck
        System.out.println("\nTesting LakeDuck:");
        lakeDuck.swim(); // LakeDuck can swim
        ((Flyable) lakeDuck).fly(); // LakeDuck can fly
        ((Quackable) lakeDuck).quack(); // LakeDuck can quack
    }
}
