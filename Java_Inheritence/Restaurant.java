interface Worker {
    void performDuties();
}

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int age) {
        super(name, age);
    }
    public void performDuties() {
        System.out.println("Cooking food");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int age) {
        super(name, age);
    }
    public void performDuties() {
        System.out.println("Serving customers");
    }
}

public class Restaurant {
    public static void main(String[] args) {
        Chef c = new Chef("Gordon", 45);
        Waiter w = new Waiter("John", 25);
        c.performDuties();
        w.performDuties();
    }
}

