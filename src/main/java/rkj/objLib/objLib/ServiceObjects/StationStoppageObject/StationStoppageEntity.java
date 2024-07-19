package rkj.objLib.objLib.ServiceObjects.StationStoppageObject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "station_stoppage")
public class StationStoppageEntity {

    @Id
    @Column(name = "station_code")
    private String stationCode;

    @Column(name = "train_list")
    @NotNull
    @Lob
    private List<Integer> trainList;

    public @NotNull List<Integer> getTrainList() {
        return trainList;
    }

    public void setTrainList(@NotNull List<Integer> trainList) {
        this.trainList = trainList;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    @Override
    public String toString() {
        return "StationStoppageEntity{" +
                "stationCode='" + stationCode + '\'' +
                ", trainList='" + trainList + '\'' +
                '}';
    }
}
