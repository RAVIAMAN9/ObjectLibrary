package rkj.objLib.objLib.ServiceObjects.StationServiceObject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    @NotNull
    @Convert(converter = IntegerListConverter.class)
    private List<Integer> trainNumbers;

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

    public List<Integer> getTrainNumbers() {
        return trainNumbers;
    }

    public void setTrainNumbers(List<Integer> trainNumbers) {
        this.trainNumbers = trainNumbers;
    }

    @Override
    public String toString() {
        return "StationEntity{" +
                "stationCode='" + stationCode + '\'' +
                ", stationName='" + stationName + '\'' +
                ", state='" + state + '\'' +
                ", trainNumbers=" + trainNumbers +
                '}';
    }

    @Converter
    public static class IntegerListConverter implements AttributeConverter<List<Integer>,String>{

        @Override
        public String convertToDatabaseColumn(List<Integer> attribute) {
            if(attribute == null || attribute.isEmpty()){
                return "";
            }
            return attribute.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(","));
        }

        @Override
        public List<Integer> convertToEntityAttribute(String dbData) {
            if(dbData == null || dbData.trim().isEmpty()){
                return new ArrayList<>();
            }
            return Arrays.stream(dbData.split(","))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());
        }
    }
}
