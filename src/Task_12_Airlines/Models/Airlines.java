package Task_12_Airlines.Models;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Locale;

public class Airlines {

    String destination;
    int flightNumber;
    String airplaneType;
    long departureTime;
    DayOfWeek dayOfWeek;


    public Airlines(String destination, int flightNumber, String airplaneType, long departureTime, DayOfWeek dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.airplaneType = airplaneType;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public long getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(long departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "Airlines{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", airplaneType='" + airplaneType + '\'' +
                ", departureTime=" + departureTime +
                ", dayOfWeek=" + dayOfWeek +
                '}';
    }
}
