package Task_10_Train.Logic;

import Task_01_Student.Models.Student;
import Task_10_Train.Models.Train;

import java.time.LocalDateTime;

public class TrainsFilters {

    public Train[] byDestination(Train[] trains, String destination){

        Train[] resultTrains= new Train[0];

        for (int i=0;i<trains.length;i++){
            Train currentTrain=trains[i];

            if (currentTrain.getDestination().equals(destination)){

                Train[] tmpArr= new Train[resultTrains.length+1];
                for (int j=0;j<resultTrains.length;j++){
                    tmpArr[j]=resultTrains[j];
                }
                tmpArr[tmpArr.length-1]=currentTrain;
                resultTrains=tmpArr;
            }
        }
        return resultTrains;
    }

    public Train[] byDestinationAndAfterTime(Train[] trains, String destination, LocalDateTime minTime){

        Train[] resultTrains= new Train[0];

        for (int i=0;i<trains.length;i++){
            Train currentTrain=trains[i];

            if (currentTrain.getDestination().equals(destination)&&currentTrain.getDispatchTime().isAfter(minTime)){

                Train[] tmpArr= new Train[resultTrains.length+1];
                for (int j=0;j<resultTrains.length;j++){
                    tmpArr[j]=resultTrains[j];
                }
                tmpArr[tmpArr.length-1]=currentTrain;
                resultTrains=tmpArr;
            }
        }
        return resultTrains;
    }

    public Train[] byDestinationAndHasPlace(Train[] trains, String destination){

        Train[] resultTrains= new Train[0];

        for (int i=0;i<trains.length;i++){
            Train currentTrain=trains[i];

            if (currentTrain.getDestination().equals(destination)&&currentTrain.getCountPlace()!=0){

                Train[] tmpArr= new Train[resultTrains.length+1];
                for (int j=0;j<resultTrains.length;j++){
                    tmpArr[j]=resultTrains[j];
                }
                tmpArr[tmpArr.length-1]=currentTrain;
                resultTrains=tmpArr;
            }
        }
        return resultTrains;
    }
}
