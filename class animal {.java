class Animal {
    void type() {
        System.out.println("Animal makes sound");
    }

    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.type();
        d.bark();

        Animal a = new Animal();
        a.type();
        a.eat();
    }
}