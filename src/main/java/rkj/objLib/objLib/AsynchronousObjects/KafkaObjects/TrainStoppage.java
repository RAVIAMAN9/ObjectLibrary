package rkj.objLib.objLib.AsynchronousObjects.KafkaObjects;

public class TrainStoppage {

    private Integer trainNumber;
    private String stoppageCode;

    public TrainStoppage() {
    }

    public TrainStoppage(Integer trainNumber, String stoppageCode) {
        this.trainNumber = trainNumber;
        this.stoppageCode = stoppageCode;
    }

    public Integer getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(Integer trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getStoppageCode() {
        return stoppageCode;
    }

    public void setStoppageCode(String stoppageCode) {
        this.stoppageCode = stoppageCode;
    }

    @Override
    public String toString() {
        return "TrainStoppage{" +
                "trainNumber=" + trainNumber +
                ", stoppageCode='" + stoppageCode + '\'' +
                '}';
    }
}
