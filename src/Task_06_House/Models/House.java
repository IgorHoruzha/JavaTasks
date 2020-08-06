package Task_06_House.Models;

public class House {

    int id;
    int apartmentNumber;
    int area;
    int floor;
    int countRooms;
    String street;
    String buildingType;
    int exploitationTerm;

    public House(int id, int apartmentNumber, int area, int floor, int countRooms, String street, String buildingType, int exploitationTerm) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.countRooms = countRooms;
        this.street = street;
        this.buildingType = buildingType;
        this.exploitationTerm = exploitationTerm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCountRooms() {
        return countRooms;
    }

    public void setCountRooms(int countRooms) {
        this.countRooms = countRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getExploitationTerm() {
        return exploitationTerm;
    }

    public void setExploitationTerm(int exploitationTerm) {
        this.exploitationTerm = exploitationTerm;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", apartmentNumber=" + apartmentNumber +
                ", area=" + area +
                ", floor=" + floor +
                ", countRooms=" + countRooms +
                ", street='" + street + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", exploitationTerm=" + exploitationTerm +
                '}';
    }
}
