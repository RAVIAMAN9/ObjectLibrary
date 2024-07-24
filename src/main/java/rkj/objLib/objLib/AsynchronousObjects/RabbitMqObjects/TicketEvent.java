//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package rkj.objLib.objLib.AsynchronousObjects.RabbitMqObjects;

public class TicketEvent {
    private Integer trainNumber;
    private Integer numberOfSeats;
    private String coachType;
    private Integer isCancellable;

    public TicketEvent() {
    }

    public Integer getTrainNumber() {
        return this.trainNumber;
    }

    public void setTrainNumber(Integer trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Integer getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getCoachType() {
        return this.coachType;
    }

    public void setCoachType(String coachType) {
        this.coachType = coachType;
    }

    public Integer getIsCancellable() {
        return this.isCancellable;
    }

    public void setIsCancellable(Integer isCancellable) {
        this.isCancellable = isCancellable;
    }
}
