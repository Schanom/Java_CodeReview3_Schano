package CityBike;

public class Bike {
    private int bikeID;
    private String color;
    private static int counter = 1;


    public Bike(String color) {
        this.bikeID = counter++;
        this.color = color;
    }

    public int getBikeID() {
        return bikeID;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeID=" + bikeID +
                ", color='" + color + '\'' +
                '}';
    }
}