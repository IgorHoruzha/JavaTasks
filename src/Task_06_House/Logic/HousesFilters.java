package Task_06_House.Logic;

import Task_01_Student.Models.Student;
import Task_06_House.Models.House;

public class HousesFilters {

    public House[] byRooms(House[] houses, int countRoom){
        House[] resultHouses= new House[0];

        for (int i=0;i<houses.length;i++){
            House currentHouse=houses[i];

            if (currentHouse.getCountRooms()==countRoom){

                House[] tmpArr= new House[resultHouses.length+1];
                for (int j=0;j<resultHouses.length;j++){
                    tmpArr[j]=resultHouses[j];
                }
                tmpArr[tmpArr.length-1]=currentHouse;
                resultHouses=tmpArr;
            }
        }
        return resultHouses;
    }

    public House[] byRoomsAndFlor(House[] houses, int countRoom,int minFloor, int maxFloor){
        House[] resultHouses= new House[0];

        for (int i=0;i<houses.length;i++){
            House currentHouse=houses[i];

            int currentFloor=currentHouse.getFloor();
            if (currentHouse.getCountRooms()==countRoom&&currentFloor>=minFloor&&currentFloor<=maxFloor){

                House[] tmpArr= new House[resultHouses.length+1];
                for (int j=0;j<resultHouses.length;j++){
                    tmpArr[j]=resultHouses[j];
                }
                tmpArr[tmpArr.length-1]=currentHouse;
                resultHouses=tmpArr;
            }
        }
        return resultHouses;
    }

    public House[] byHigherArea(House[] houses, int minArea){
        House[] resultHouses= new House[0];

        for (int i=0;i<houses.length;i++){
            House currentHouse=houses[i];

            int currentFloor=currentHouse.getFloor();
            if (currentHouse.getArea()>minArea){

                House[] tmpArr= new House[resultHouses.length+1];
                for (int j=0;j<resultHouses.length;j++){
                    tmpArr[j]=resultHouses[j];
                }
                tmpArr[tmpArr.length-1]=currentHouse;
                resultHouses=tmpArr;
            }
        }
        return resultHouses;
    }
}
