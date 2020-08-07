package Task_11_Bus.Models;
import java.time.LocalDate;

public class Bus {
    String driverInfo;
    int busNumber;
    int routeNumber;
    LocalDate  operationStart;
    int mileage;

    public Bus(String driverInfo, int busNumber, int routeNumber, LocalDate operationStart, int mileage) {
        this.driverInfo = driverInfo;
        this.busNumber = busNumber;
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

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
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
                ", trainNumber=" + busNumber +
                ", routeNumber=" + routeNumber +
                ", operationStart=" + operationStart +
                ", mileage=" + mileage +
                '}';
    }
}
