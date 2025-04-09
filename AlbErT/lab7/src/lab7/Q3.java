
package lab7;

class Fruit {
    String name;
    String taste;
    String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("The " + name + " tastes " + taste + " and it is " + size + ".");
    }
}
class Apple extends Fruit {

    public Apple(String size) {
        super("Apple", "sweet", size); 
    }

    public void eat() {
        System.out.println("The Apple is " + taste + " and it is " + size + ".");
    }
}

class Orange extends Fruit {

    public Orange(String size) {
        super("Orange", "sour", size);
    }

    public void eat() {
        System.out.println("The Orange is " + taste + " and it is " + size + ".");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Apple apple = new Apple("medium");
        Orange orange = new Orange("large");

        apple.eat(); 
        orange.eat();
    }
}
