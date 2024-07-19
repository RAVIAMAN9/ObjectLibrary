package rkj.objLib.objLib.ServiceObjects.TicketObject;

import rkj.objLib.objLib.ServiceObjects.PassengerObject.Passenger;

import java.util.List;

public class Ticket {

    private Integer trainNumber;
    private String boarding;
    private String destination;
    private List<Passenger> passengerList;

    public Integer getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(Integer trainNumber) {
        this.trainNumber = trainNumber;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public String getBoarding() {
        return boarding;
    }

    public void setBoarding(String boarding) {
        this.boarding = boarding;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "trainNumber=" + trainNumber +
                ", source='" + boarding + '\'' +
                ", destination='" + destination + '\'' +
                ", passengerList=" + passengerList +
                '}';
    }
}
