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

    @Override
    public String toString() {
        return "TicketEntity{" +
                "pnrNumber=" + pnrNumber +
                ", trainNumber=" + trainNumber +
                ", boarding='" + boarding + '\'' +
                ", destination='" + destination + '\'' +
                ", passengerList=" + passengerList +
                '}';
    }
}
