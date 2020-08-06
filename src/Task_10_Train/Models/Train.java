package Task_10_Train.Models;

import java.time.LocalDateTime;

public class Train {
    String destination;
    int trainNumber;
    LocalDateTime dispatchTime;
    int countPlace;

    public Train(String destination, int trainNumber, LocalDateTime dispatchTime, int countPlace) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.dispatchTime = dispatchTime;
        this.countPlace = countPlace;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public LocalDateTime getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(LocalDateTime dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public int getCountPlace() {
        return countPlace;
    }

    public void setCountPlace(int countPlace) {
        this.countPlace = countPlace;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", dispatchTime=" + dispatchTime +
                ", countPlace=" + countPlace +
                '}';
    }
}
