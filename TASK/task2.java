// Parent class
class Human {
    protected String name;
    
    public Human(String name) {
        this.name = name;
    }
    
    public void eat() {
        System.out.println(name + " is functioning.");
    }
}

// Child class inheriting from Human
class Body extends Human {
    private int age;
    
    public Body(String name, int age) {
        super(name);
        this.age = age;
    }
    
    public void work() {
        System.out.println(name + " is working.");
    }
    
    public void sleep(String item) {
        System.out.println(name + " is sleeping.");
    }
}
public class Main {
    public static void main(String[] args) {
        // Create an instance of Body
        Body body = new Body("MOMO", 3);
        
        // Accessing variables and calling methods
        System.out.println("Name: " + body.name); // Accessing protected variable from parent class
        body.work(); // Calling inherited method
        body.eat(); // Calling method from child class
        body.sleep("1hr"); // Calling method with parameter
        
        // Create another instance of Body
        Body anotherBody = new Body("MIMI", 5);
        anotherBody.eat();
        anotherBody.sleep();
    }
}
