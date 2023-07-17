class Animal {
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}
class Dog extends Animal{
    public void display(){
        Sytem.out.println("My name is"+name);
    }
}
class Main(){
    public static void main(String[] args) {
        Dog poodle= new Dog();
        poodle.name ="COCO";
        poodle.display();
        poodle.eat();
    }
}