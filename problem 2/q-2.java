interface Testable {
    void display();
}

class Test implements Testable {
    // Implementing the display() method
    @Override
    public void display() {
        System.out.println("Displaying from Test class");
    }
}

abstract class AbsTest implements Testable {
    // We are not implementing the display() method here, leaving it for subclasses to implement
}

class ConcreteTest extends AbsTest {
    @Override
    public void display() {
        System.out.println("Displaying from ConcreteTest class");
    }
}

public class Main {
    public static void main(String[] args) {
        // Part a: Testing the Test class (concrete class implementing Testable)
        Testable test = new Test();
        test.display();  // This will call the display() method in the Test class

        // Part b: Testing the AbsTest class (abstract class implementing Testable)
        Testable absTest = new ConcreteTest();
        absTest.display();  // This will call the display() method in the ConcreteTest class
    }
}
