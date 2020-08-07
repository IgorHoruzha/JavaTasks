package Task_11_Bus.Logic;

import Task_01_Student.Models.Student;
import Task_11_Bus.Models.Bus;

import java.time.LocalDate;

public class BusesFilters {

    public Bus[] byFaculty(Bus[] buses, int routeNumber){

        Bus[] resultBus= new Bus[0];

        for (int i=0;i<buses.length;i++){
            Bus currentBus=buses[i];

            if (currentBus.getRouteNumber()==routeNumber){

                Bus[] tmpArr= new Bus[resultBus.length+1];
                for (int j=0;j<resultBus.length;j++){
                    tmpArr[j]=resultBus[j];
                }
                tmpArr[tmpArr.length-1]=currentBus;
                resultBus=tmpArr;
            }
        }
        return resultBus;
    }

    static LocalDate tenYears= LocalDate.of(10,0,0);

    public Bus[] byOperationStartMoreThen10Years(Bus[] buses){

        Bus[] resultBus= new Bus[0];

        for (int i=0;i<buses.length;i++){
            Bus currentBus=buses[i];

            if (currentBus.getOperationStart().isAfter(currentBus.getOperationStart().plusYears(10))){

                Bus[] tmpArr= new Bus[resultBus.length+1];
                for (int j=0;j<resultBus.length;j++){
                    tmpArr[j]=resultBus[j];
                }
                tmpArr[tmpArr.length-1]=currentBus;
                resultBus=tmpArr;
            }
        }
        return resultBus;
    }
    public Bus[] byMileageMoreThan100000(Bus[] buses){

        Bus[] resultBus= new Bus[0];

        for (int i=0;i<buses.length;i++){
            Bus currentBus=buses[i];

            if (currentBus.getMileage() > 100000){

                Bus[] tmpArr= new Bus[resultBus.length+1];
                for (int j=0;j<resultBus.length;j++){
                    tmpArr[j]=resultBus[j];
                }
                tmpArr[tmpArr.length-1]=currentBus;
                resultBus=tmpArr;
            }
        }
        return resultBus;
    }


}
