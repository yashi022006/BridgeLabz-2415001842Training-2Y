import java.util.*;

class Fruit {
    public String toString() { return "Fruit"; }
}

class Apple extends Fruit {
    public String toString() { return "Apple"; }
}

class Mango extends Fruit {
    public String toString() { return "Mango"; }
}

class FruitBox<T extends Fruit> {
    private List<T> list = new ArrayList<>();

    public void add(T fruit) {
        list.add(fruit);
    }

    public void display() {
        for (T f : list) {
            System.out.println(f);
        }
    }
}

public class FruitBox1 {
    public static void main(String[] args) {

        FruitBox<Fruit> box = new FruitBox<>();
        box.add(new Apple());
        box.add(new Mango());
        box.display();


    }
}
