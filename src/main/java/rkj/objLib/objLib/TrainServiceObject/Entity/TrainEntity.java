package rkj.objLib.objLib.TrainServiceObject.Entity;

import jakarta.persistence.*;
import rkj.objLib.objLib.Enums.TrainType;

@Entity
@Table(name = "train")
public class TrainEntity {

    @Id
    @Column(name = "train_number")
    private Integer trainNumber;
    @Column(name = "train_name", nullable = false)
    private String trainName;
    @Column(nullable = false)
    private String source;
    @Column(nullable = false)
    private String destination;
    @Column(name="train_type",nullable = false)
    private String trainType;
    @Column(name="ac_3Tier")
    private Integer Ac3Tier;
    @Column(name="ac_2Tier")
    private Integer Ac2Tier;
    @Column(name="ac_1Tier")
    private Integer Ac1Tier;
    private Integer sleeper;
    @Column(name="chair_car")
    private Integer chairCar;

    @PrePersist
    public void prePersist(){
        if(this.trainType.toUpperCase().equals(TrainType.EXPRESS.getValue())){
            this.Ac3Tier = 100;
            this.Ac2Tier = 100;
            this.Ac1Tier = 100;
            this.sleeper = 100;
            this.chairCar=-1;
        } else if(this.trainType.toUpperCase().equals(TrainType.RAJDHANI_EXPRESS.getValue())){
            this.Ac3Tier = 200;
            this.Ac2Tier = 200;
            this.Ac1Tier = 200;
            this.sleeper=-1;
            this.chairCar=-1;
        } else if((this.trainType.toUpperCase().equals(TrainType.SHATABDI_EXPRESS.getValue())) || (this.trainType.toUpperCase().equals(TrainType.VANDE_BHARAT_EXPRESS.getValue()))){
            this.Ac3Tier = -1;
            this.Ac2Tier = -1;
            this.Ac1Tier = -1;
            this.sleeper=-1;
            this.chairCar=300;
        } else if(this.trainType.toUpperCase().equals(TrainType.PASSENGER.getValue())){
            this.Ac3Tier = -1;
            this.Ac2Tier = -1;
            this.Ac1Tier = -1;
            this.sleeper=-1;
            this.chairCar=-1;
        }
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

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public Integer getAc3Tier() {
        return Ac3Tier;
    }

    public void setAc3Tier(Integer ac3Tier) {
        Ac3Tier = ac3Tier;
    }

    public Integer getAc2Tier() {
        return Ac2Tier;
    }

    public void setAc2Tier(Integer ac2Tier) {
        Ac2Tier = ac2Tier;
    }

    public Integer getAc1Tier() {
        return Ac1Tier;
    }

    public void setAc1Tier(Integer ac1Tier) {
        Ac1Tier = ac1Tier;
    }

    public Integer getSleeper() {
        return sleeper;
    }

    public void setSleeper(Integer sleeper) {
        this.sleeper = sleeper;
    }

    public Integer getChairCar() {
        return chairCar;
    }

    public void setChairCar(Integer chairCar) {
        this.chairCar = chairCar;
    }

    @Override
    public String toString() {
        return "TrainEntity{" +
                "trainNumber=" + trainNumber +
                ", trainName='" + trainName + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", trainType='" + trainType + '\'' +
                ", Ac3Tier=" + Ac3Tier +
                ", Ac2Tier=" + Ac2Tier +
                ", Ac1Tier=" + Ac1Tier +
                ", sleeper=" + sleeper +
                ", chairCar=" + chairCar +
                '}';
    }
}
