package rkj.objLib.objLib.ServiceObjects.TrainServiceObject.Dto;

import java.util.List;

public class Train {

    private Integer trainNumber;
    private String trainName;
    private String source;
    private String destination;
    private String trainType;
    private List<String> stoppages;

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public Integer getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(Integer trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<String> getStoppages() {
        return stoppages;
    }

    public void setStoppages(List<String> stoppages) {
        this.stoppages = stoppages;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainNumber=" + trainNumber +
                ", trainName='" + trainName + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", trainType='" + trainType + '\'' +
                ", stoppages=" + stoppages +
                '}';
    }
}
