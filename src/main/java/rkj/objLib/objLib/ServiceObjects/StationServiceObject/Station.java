package rkj.objLib.objLib.ServiceObjects.StationServiceObject;

import java.util.List;

public class Station {

    private String stationCode;
    private String stationName;
    private String state;
    private List<Integer> trainNumbers;

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Integer> getTrainNumbers() {
        return trainNumbers;
    }

    public void setTrainNumbers(List<Integer> trainNumbers) {
        this.trainNumbers = trainNumbers;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationCode='" + stationCode + '\'' +
                ", stationName='" + stationName + '\'' +
                ", state='" + state + '\'' +
                ", trainNumbers=" + trainNumbers +
                '}';
    }
}
