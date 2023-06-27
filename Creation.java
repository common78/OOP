class Human {
    // Common attributes and methods for all humans
    // ...

    public String toString() {
        return "Human";
    }
}

class Man extends Human {
    // Additional attributes and methods specific to men
    // ...

    @Override
    public String toString() {
        return "Man";
    }
}

class Woman extends Human {
    // Additional attributes and methods specific to women
    // ...

    @Override
    public String toString() {
        return "Woman";
    }
}

public class Creation {
    public static Object[] create() {
        Human adam = new Man();
        Human eve = new Woman();
        return new Object[] { adam, eve };
    }

    public static void main(String[] args) {
        Object[] humans = create();
        System.out.println(humans[0]); // Output: Man
        System.out.println(humans[1]); // Output: Woman
    }
}
