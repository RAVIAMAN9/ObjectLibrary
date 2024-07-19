package rkj.objLib.objLib.ServiceObjects.TicketObject;

public class TicketResponse extends Ticket {
    private Integer pnrNumber;
    private String trainName;

    public Integer getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(Integer pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    @Override
    public String toString() {
        return "TicketResponse{" +
                "pnrNumber=" + pnrNumber +
                ", trainName='" + trainName + '\'' +
                '}';
    }
}
