interface Vehicle{
    void setPrice(double price);
}
interface Moveable{
    void start();
    void stop();
}
interface Flyable{
    void fly();
}

class Car implements Vehicle, Moveable{
    double price;

    @Override
    public void setPrice(double price){
        this.price = price;
    }
    //get method for return the price
    public double getPrice(){
        return this.price;
    }

    @Override
    public void start(){
        System.out.println("Car is starting.");
    }
    @Override
    public void stop(){
        System.out.println("Car is stoped.");        
    }
}
class Airplane implements Vehicle, Moveable, Flyable{
    double price;

    @Override
    public void setPrice(double price){
        this.price = price;
    }
    //get method for return the price
    public double getPrice(){
        return this.price;
    }

    @Override
    public void start(){
        System.out.println("Airplane is starting.");
    }
    @Override
    public void fly(){
        System.out.println("Airplane is flying.");
    }
    @Override
    public void stop(){
        System.out.println("Airplane is stoped.");
    } 
}
public class Vehicle{
    public static void main(String[] args){
        Car bmw = buildCar();
        System.out.println("Price of this car is: "+ bmw.getPrice());
        bmw.start();
        bmw.stop();
        
        Airplane boing707 = buildAirplane();
        System.out.println("Price of this airplane: " + boing707.getPrice());
        boing707.start();
        boing707.fly();
        boing707.stop();
    }
    //Static method for create new instence of Car class
    public static Car buildCar() {
        Car car = new Car();
        car.setPrice(100.00);
        return car;
    }
    
    //Static method for create new instence of Airplane class
    public static Airplane buildAirplane(){
        Airplane airplane = new Airplane();
        airplane.setPrice(200.00);
        return airplane;
    }
    
}
