package rkj.objLib.objLib.ServiceObjects.StationStoppageObject;

import java.util.List;

public class StationStoppage {

    private String stationCode;
    private List<Integer> trainList;

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public List<Integer> getTrainList() {
        return trainList;
    }

    public void setTrainList(List<Integer> trainList) {
        this.trainList = trainList;
    }
}
