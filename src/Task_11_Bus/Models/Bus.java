package Task_11_Bus.Models;
import java.time.LocalDate;

public class Bus {
    String driverInfo;
    int trainNumber;
    int routeNumber;
    LocalDate  operationStart;
    int mileage;

    public Bus(String driverInfo, int trainNumber, int routeNumber, LocalDate operationStart, int mileage) {
        this.driverInfo = driverInfo;
        this.trainNumber = trainNumber;
        this.routeNumber = routeNumber;
        this.operationStart = operationStart;
        this.mileage = mileage;
    }

    public String getDriverInfo() {
        return driverInfo;
    }

    public void setDriverInfo(String driverInfo) {
        this.driverInfo = driverInfo;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public LocalDate getOperationStart() {
        return operationStart;
    }

    public void setOperationStart(LocalDate operationStart) {
        this.operationStart = operationStart;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "driverInfo='" + driverInfo + '\'' +
                ", trainNumber=" + trainNumber +
                ", routeNumber=" + routeNumber +
                ", operationStart=" + operationStart +
                ", mileage=" + mileage +
                '}';
    }
}
