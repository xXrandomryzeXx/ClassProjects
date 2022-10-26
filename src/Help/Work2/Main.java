/* Current file: Main.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package Help.Work2;

abstract class Vehicle{
    private int maxSpeed = 0;
    private String model = "";
    private float price = 0.0f;

    Vehicle(int MaxSpeed, String Model, float Price){
        setMaxSpeed(MaxSpeed);
        setModel(Model);
        setPrice(Price);
    }

    public abstract double checkPromo();

    public void setMaxSpeed(int value){
        maxSpeed = value;
    }
    public void setModel(String value){
        model = value;
    }
    public void setPrice(float value){
        price = value;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    public String getModel(){
        return model;
    }
    public float getPrice(){
        return price;
    }

}

interface isLandVehicle{
    void enterLand();
}

interface isSeaVessel{
    void enterSea();
}

class Car extends Vehicle implements isLandVehicle{
    private int kW = 0;

    Car(int MaxSpeed, String Model, float Price) {
        super(MaxSpeed, Model, Price);
    }

    @Override
    public double checkPromo() {
        return getPrice() - (getPrice() * 0.20);
    }

    public void setkW(int value){
        kW = value;
    }
    public int getkW(){
        return kW;
    }

    @Override
    public void enterLand() {
        System.out.println("Vroom Vroom");
    }
}

class Hovercraft extends Vehicle implements isLandVehicle,isSeaVessel{
    private int passengers = 0;
    Hovercraft(int MaxSpeed, String Model, float Price) {
        super(MaxSpeed, Model, Price);
    }

    @Override
    public double checkPromo() {
        return getPrice() - (getPrice() * 0.03);
    }
    public void setPassengers(int value){
        passengers = value;
    }
    public int getPassengers(){
        return passengers;
    }

    @Override
    public void enterLand() {
        System.out.println("Vroom Vroom");
    }

    @Override
    public void enterSea() {
        System.out.println("Blob Vroom Blob");
    }

}

class Ship extends Vehicle implements isSeaVessel{
    private float deadweight = 0.0f;
    Ship(int MaxSpeed, String Model, float Price) {
        super(MaxSpeed, Model, Price);
    }

    @Override
    public double checkPromo() {
        return getPrice() - (getPrice() * 0.003);
    }
    public void setDeadweight(float value){
        deadweight = value;
    }
    public float getDeadweight(){
        return deadweight;
    }

    @Override
    public void enterSea() {
        System.out.println("Blob Blob");
    }
}

class Test{
    public Test(){
        Car car = new Car(180, "FordFiestaSt", 18000.0f);
        car.setkW(2000);
        Hovercraft hovercraft = new Hovercraft(80, "1.4", 20000.0f);
        hovercraft.setPassengers(4);
        Ship ship = new Ship(30, "Titanic", (float)Math.pow(10, 6)); // 10^6 = 10 000 000
        ship.setDeadweight(100000);

        System.out.println("Гледаме Колата");
        System.out.println("Модела на колата е: " + car.getModel());
        System.out.println("Тя може да вдигне до: " + car.getMaxSpeed() + "км/ч");
        System.out.println("Мощтността на колата е: "+ car.getkW()+ "kW");
        System.out.println("Колата струва: " + car.getPrice() + "лв.");
        System.out.println("Промоционалната цена е: " + car.checkPromo() + "лв.");
        System.out.print("Когато караш на суша: "); car.enterLand();
        System.out.println();
        System.out.println("Гледаме Ховъркрафта");
        System.out.println("Модела е: " + hovercraft.getModel());
        System.out.println("Той може да вдигне до: " + hovercraft.getMaxSpeed() + "км/ч");
        System.out.println("Може да носи: " + hovercraft.getPassengers() + "пътника");
        System.out.println("Ховъркрафта струва: " + hovercraft.getPrice() + "лв.");
        System.out.println("Промоционалната цена е: " + hovercraft.checkPromo() + "лв.");
        System.out.print("Когато караш на суша: "); hovercraft.enterLand();
        System.out.print("Когато караш на вода: "); hovercraft.enterSea();
        System.out.println();
        System.out.println("Гледаме Кораба");
        System.out.println("Модела е: " + ship.getModel());
        System.out.println("Той може да вдигне: " + ship.getMaxSpeed() + "км/ч");
        System.out.println("Дедуейта на кораба е: " + ship.getDeadweight() + "кг.");
        System.out.println("Кораба струва: " + ship.getPrice() + "лв.");
        System.out.println("Промоционалната цена е: " + ship.checkPromo() + "лв.");
        System.out.print("Когато плаваш: "); ship.enterSea();


    }
}

public class Main {
    public static void main(String[] args){
        Test test = new Test();
    }
}
