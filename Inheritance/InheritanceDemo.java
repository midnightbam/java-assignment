class Animal {
    private String name;

    void setName(String name) {
        this.name = name;  
    }
    String getName() {
        return name;  
    }
    void eat() {
        System.out.println(name + " is eating!");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(getName() + " is barking!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setName("Buddy");
        myDog.eat();
        myDog.bark();
    }
}

