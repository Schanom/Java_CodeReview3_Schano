package CityBike;

import java.util.ArrayList;

public class Station {
    private int stationID;
    private static int counter = 1;
    private String location;
    private ArrayList<Bike> bikesList;

    public Station(String location){
        this.location = location;
        this.stationID = counter++;
        this.bikesList = new ArrayList<>();
    }

    public int getStationID() {
        return stationID;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList getBikesList(){
        return bikesList;
    }

    //A Station always allows max 3 Bikes stored
    public void addBike(Bike bike){
        if (bikesList.size() < 3){
            bikesList.add(bike);
        }
        else {
            System.out.println("No room left for Bike ID " + bike.getBikeID() +" in station" + stationID + " in the " + location + ".");
        }
    }

    public void removeBike(Bike bike){
        bikesList.remove(bike);
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationID=" + stationID +
                ", location='" + location + '\'' +
                ", bikesList=" + bikesList +
                '}';
    }
}
