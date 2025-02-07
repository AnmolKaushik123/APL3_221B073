abstract class Bharatvanshi {
    // Abstract methods for fight, obey, and kind
    public abstract void fight();
    public abstract void obey();
    public abstract void kind();

    // Non-abstract method to describe (if necessary)
    public void describe() {
        System.out.println("Bharatvanshi is a warrior.");
    }
}

class Pandav extends Bharatvanshi {
    // Pandav's implementation of fight
    @Override
    public void fight() {
        System.out.println(this.getClass().getSimpleName() + " is a skilled fighter!");
    }

    @Override
    public void obey() {
        System.out.println(this.getClass().getSimpleName() + " is obedient.");
    }

    @Override
    public void kind() {
        System.out.println(this.getClass().getSimpleName() + " is kind.");
    }
}

// Concrete class Kaurav inheriting Bharatvanshi
class Kaurav extends Bharatvanshi {
    // Kaurav's implementation of fight
    @Override
    public void fight() {
        System.out.println(this.getClass().getSimpleName() + " is a strong fighter!");
    }

    // Kaurav's implementation of obey
    @Override
    public void obey() {
        System.out.println(this.getClass().getSimpleName() + " is disobedient.");
    }

    // Kaurav's implementation of kind
    @Override
    public void kind() {
        System.out.println(this.getClass().getSimpleName() + " is cruel.");
    }
}

// Vikarn class, a special Kaurav who is obedient and kind
class Vikarn extends Kaurav {
    // Vikarn's implementation of fight (override Kaurav's version)
    @Override
    public void fight() {
        System.out.println("Vikarn is a great fighter!");
    }

    // Vikarn's implementation of obey (override Kaurav's version)
    @Override
    public void obey() {
        System.out.println("Vikarn is obedient.");
    }

    // Vikarn's implementation of kind (override Kaurav's version)
    @Override
    public void kind() {
        System.out.println("Vikarn is kind.");
    }
}

// Arjun class, a Pandav with specific implementations
class Arjun extends Pandav {
    // Arjun's implementation of obey (override Pandav's version)
    @Override
    public void obey() {
        super.obey();
        System.out.println("Arjun follows his principles.");
    }

    // Arjun's implementation of kind (override Pandav's version)
    @Override
    public void kind() {
        super.kind();
        System.out.println("Arjun is known for his kindness.");
    }
}

// Bheem class, a Pandav with specific implementations
class Bheem extends Pandav {
    // Bheem's implementation of obey (override Pandav's version)
    @Override
    public void obey() {
        super.obey();
        System.out.println("Bheem follows orders without question.");
    }

    // Bheem's implementation of kind (override Pandav's version)
    @Override
    public void kind() {
        System.out.println("Bheem is less kind than Arjun.");
    }
}


class Duryodhan extends Kaurav {
    // Duryodhan's implementation of obey (override Kaurav's version)
    @Override
    public void obey() {
        System.out.println("Duryodhan refuses to obey.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects for testing
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi duryodhan = new Duryodhan();
        Bharatvanshi vikarn = new Vikarn();

        // Test the Pandav (Arjun and Bheem)
        System.out.println("Testing Arjun:");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        System.out.println("\nTesting Bheem:");
        bheem.fight();
        bheem.obey();
        bheem.kind();

        // Test the Kaurav (Duryodhan and Vikarn)
        System.out.println("\nTesting Duryodhan:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        System.out.println("\nTesting Vikarn:");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
