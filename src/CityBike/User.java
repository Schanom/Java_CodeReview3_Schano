package CityBike;

import java.util.ArrayList;

public class User {
    private int userID;
    private static int counter = 1;
    private String name;
    private String surname;
    private ArrayList<Bike> currentlyRentedBike;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.currentlyRentedBike = new ArrayList<>();
        this.userID = counter++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void rentBike(Bike bike, Station station){
        if (station.getBikesList().size() > 0){
            station.removeBike(bike);
            currentlyRentedBike.add(bike);
            System.out.println("User " + name + " " + surname + " successfully rented bike ID " + bike.getBikeID() + " from " + station.getLocation() + " station. Have fun.");
        } else {
            System.out.println("There are no bikes left to rent " + name + " " + surname + " at this station. Poor you.");
        }
    }

    public void returnBike(Bike bike, Station station){
        if (station.getBikesList().size() < 3){
            station.addBike(bike);
            currentlyRentedBike.remove(bike);
            System.out.println("User " + name + " " + surname + " successfully returned bike ID " + bike.getBikeID() + " to the station in the " + station.getLocation() + ". Thank you.");
        } else{
            System.out.println("There is no room left in the " + station.getLocation() + " station return location. Please try one of our other stations.");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", currentlyRentedBike=" + currentlyRentedBike +
                '}';
    }


}
