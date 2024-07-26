package rkj.objLib.objLib.ServiceObjects.TicketObject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "ticket")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pnrSequence")
    @SequenceGenerator(name = "pnrSequence" , initialValue = 1000000000, sequenceName = "pnrSeq",allocationSize = 1)
    @Column(name = "pnr_number")
    private Integer pnrNumber;

    @Column(name = "train_number")
    @NotNull
    private Integer trainNumber;

    @NotNull
    private String boarding;

    @NotNull
    private String destination;

    @NotNull
    @Lob
    private String passengerList;

    @NotNull
    @Column(name = "coach_type")
    private String coachType;

    @NotNull
    @Column(name="ticket_status")
    private Integer ticketStatus;

    @PrePersist
    void initializeData(){
        ticketStatus = 0;
    }

    public Integer getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(Integer pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public @NotNull Integer getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(@NotNull Integer trainNumber) {
        this.trainNumber = trainNumber;
    }

    public @NotNull String getBoarding() {
        return boarding;
    }

    public void setBoarding(@NotNull String boarding) {
        this.boarding = boarding;
    }

    public @NotNull String getDestination() {
        return destination;
    }

    public void setDestination(@NotNull String destination) {
        this.destination = destination;
    }

    public @NotNull String getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(@NotNull String passengerList) {
        this.passengerList = passengerList;
    }

    public String getCoachType() {
        return coachType;
    }

    public void setCoachType(String coachType) {
        this.coachType = coachType;
    }

    public Integer getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(Integer ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    @Override
    public String toString() {
        return "TicketEntity{" +
                "pnrNumber=" + pnrNumber +
                ", trainNumber=" + trainNumber +
                ", boarding='" + boarding + '\'' +
                ", destination='" + destination + '\'' +
                ", passengerList='" + passengerList + '\'' +
                ", coachType='" + coachType + '\'' +
                ", ticketStatus=" + ticketStatus +
                '}';
    }
}
