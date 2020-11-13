package CityBike;

import java.util.HashMap;

public class TestApp {
    public static void main(String[] args) {

        Bike bike1 = new Bike("Red");
        Bike bike2 = new Bike("Blue");
        Bike bike3 = new Bike("Yellow");
        Bike bike4 = new Bike("Green");
        Bike bike5 = new Bike("Orange");
        Bike bike6 = new Bike("Silver");
        Bike bike7 = new Bike("Gold");
        Bike bike8 = new Bike("Black");

        HashMap<Integer, Bike> bicycles = new HashMap<>();
        bicycles.put (bike1.getBikeID(), bike1);
        bicycles.put (bike2.getBikeID(), bike2);
        bicycles.put (bike3.getBikeID(), bike3);
        bicycles.put (bike4.getBikeID(), bike4);
        bicycles.put (bike5.getBikeID(), bike5);
        bicycles.put (bike6.getBikeID(), bike6);
        bicycles.put (bike7.getBikeID(), bike7);
        bicycles.put (bike8.getBikeID(), bike8);

        Station station1 = new Station("16.District");
        Station station2 = new Station("7.District");
        Station station3 = new Station("14.District");

        HashMap<Integer, Station> stations = new HashMap<>();
        stations.put(station1.getStationID(), station1);
        stations.put(station2.getStationID(), station2);
        stations.put(station3.getStationID(), station3);

        station1.addBike(bike1);
        station1.addBike(bike2);
        station1.addBike(bike3);
        station2.addBike(bike4);
        station2.addBike(bike6);
        station2.addBike(bike7);
        station2.addBike(bike8);

        System.out.println(station1);
        System.out.println(station2);

        System.out.println();

        User user1 = new User("Aaron", "Aaronson");
        User user2 = new User("Beatrix", "Bean");
        User user3 = new User("Clint", "Caesar");
        User user4 = new User("Dave", "Danse");


        user1.rentBike(bike1, station1);
        user1.returnBike(bike1, station2);
        user1.returnBike(bike1, station3);

    }
}
