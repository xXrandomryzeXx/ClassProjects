package Help.Work3;

abstract class Journey{
    float distance = 0;
    int days = 0;
    double price = 0.0;

    public Journey(float Distance, int Days, double Price){
        setDistance(Distance);
        setDays(Days);
        setPrice(Price);
    }

    abstract void fixPrice();

    public void setDistance(float value){
        distance = value;
    }
    public void setDays(int value){
        days = value;
    }
    public void setPrice(double value){
        price = value;
    }

    public float getDistance(){
        return distance;
    }
    public int getDays(){
        return days;
    }
    public double getPrice(){
        return price;
    }
}

interface NumberOfNights{
    int CalculateNights();
}

class Excursion extends Journey implements NumberOfNights {
    int hotels = 0;

    public Excursion(float Distance, int Days, double Price) {
        super(Distance, Days, Price);
    }

    @Override
    public void fixPrice() {
        price += (price*0.1);
    }

    @Override
    public int CalculateNights() {
        int allDays = 0;
        allDays += getDays() + (getHotels() * 2); //Пътуванията са толкова, колкото хотелите * 2
        return allDays;
    }

    public void setHotels(int value){
        hotels = value;
    }

    public int getHotels(){
        return hotels;
    }
}

class Vacation extends Journey{
    String hotelName = "";
    public Vacation(float Distance, int Days, double Price){
        super(Distance, Days, Price);
    }

    @Override
    public void fixPrice(){
        price += price*0.4;
    }

    public void setHotelName(String value){
        hotelName = value;
    }

    public String getHotelName(){
        return hotelName;
    }
}


public class Main {
    public static void main(String[] args){
        Excursion excursion = new Excursion(426.5f, 6, 1200);
        excursion.setHotels(4);
        System.out.println("Екскурзията ще продължи: " + excursion.CalculateNights() + " дни, със пътуване.");
        System.out.println("Ще се преношува в: " + excursion.getHotels() + " хотела");
        System.out.println("Ще се нощува: " + excursion.getDays() + " дни в хотели.");
        System.out.println("Ще се пътува: " + excursion.getDistance() + "км.");
        excursion.fixPrice();
        System.out.println("Цената за екскурзията е: " + excursion.getPrice());

        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("");

        Vacation vacation = new Vacation(1168.3f, 16, 3200);
        vacation.setHotelName("PalmStill");
        System.out.println("Ваканцията ще бъде в хотел: " + vacation.getHotelName());
        System.out.println("Дистанцията до хотела е: " + vacation.getDistance() + "км.");
        System.out.println("Ваканцията ще продължи: " + vacation.getDays() + " дни.");
        vacation.fixPrice();
        System.out.println("Цената за ваканцията е: " + vacation.getPrice() + "лв.");

    }
}
