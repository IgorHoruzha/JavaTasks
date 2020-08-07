package Task_12_Airlines.Logic;

import Task_01_Student.Models.Student;
import Task_12_Airlines.Models.Airlines;

import java.time.DayOfWeek;

public class AirlinesFilters {

    public Airlines[] byDestination(Airlines[] airlines, String destination){

        Airlines[] resultDestination= new Airlines[0];

        for (int i=0;i<airlines.length;i++){
            Airlines currentAirline=airlines[i];

            if (currentAirline.getDestination().equals(destination)){

                Airlines[] tmpArr= new Airlines[resultDestination.length+1];
                for (int j=0;j<resultDestination.length;j++){
                    tmpArr[j]=resultDestination[j];
                }
                tmpArr[tmpArr.length-1]=currentAirline;
                resultDestination=tmpArr;
            }
        }

        return resultDestination;
    }

    public Airlines[] byDayOfWeek(Airlines[] airlines, DayOfWeek dayOfWeek){

        Airlines[] resultDestination= new Airlines[0];

        for (int i=0;i<airlines.length;i++){
            Airlines currentAirline=airlines[i];

            if (currentAirline.getDayOfWeek()==dayOfWeek){

                Airlines[] tmpArr= new Airlines[resultDestination.length+1];
                for (int j=0;j<resultDestination.length;j++){
                    tmpArr[j]=resultDestination[j];
                }
                tmpArr[tmpArr.length-1]=currentAirline;
                resultDestination=tmpArr;
            }
        }

        return resultDestination;
    }

    public Airlines[] byDayOfWeekAndDepartureTime(Airlines[] airlines, DayOfWeek dayOfWeek,long departureTime){

        Airlines[] resultDestination= new Airlines[0];

        for (int i=0;i<airlines.length;i++){
            Airlines currentAirline=airlines[i];

            if (currentAirline.getDayOfWeek()==dayOfWeek&&currentAirline.getDepartureTime()==departureTime){

                Airlines[] tmpArr= new Airlines[resultDestination.length+1];
                for (int j=0;j<resultDestination.length;j++){
                    tmpArr[j]=resultDestination[j];
                }
                tmpArr[tmpArr.length-1]=currentAirline;
                resultDestination=tmpArr;
            }
        }

        return resultDestination;
    }

}
