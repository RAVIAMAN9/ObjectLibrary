package rkj.objLib.objLib.StationServiceObject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="station")
public class StationEntity {

    @Id
    @Column(name = "station_code")
    @NotNull
    private String stationCode;

    @Column(name = "station_name")
    @NotNull
    private String stationName;

    @NotNull
    private String state;

    public @NotNull String getStationCode() {
        return stationCode;
    }

    public void setStationCode(@NotNull String stationCode) {
        this.stationCode = stationCode;
    }

    public @NotNull String getStationName() {
        return stationName;
    }

    public void setStationName(@NotNull String stationName) {
        this.stationName = stationName;
    }

    public @NotNull String getState() {
        return state;
    }

    public void setState(@NotNull String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "StationEntity{" +
                "stationCode='" + stationCode + '\'' +
                ", stationName='" + stationName + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
