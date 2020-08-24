package Task_12_Airlines;

import Library.ArrayTools;
import Task_12_Airlines.Logic.AirlinesFilters;
import Task_12_Airlines.Models.Airlines;

import java.time.DayOfWeek;

public class TwelfthTaskExecutor {
    public static void start() {
        System.out.println("Task 12:");

        Airlines[] airlines = new Airlines[]{
                new Airlines("Destination1", 11, "AirplaneType1", 10001, DayOfWeek.MONDAY),
                new Airlines("Destination2", 12, "AirplaneType2", 10002, DayOfWeek.THURSDAY),
                new Airlines("Destination3", 13, "AirplaneType3", 10003, DayOfWeek.THURSDAY),
                new Airlines("Destination1", 14, "AirplaneType4", 10004, DayOfWeek.WEDNESDAY)
        };

        AirlinesFilters airlinesFilters = new AirlinesFilters();

        System.out.println("a:");
        Airlines[] byDestination = airlinesFilters.byDestination(airlines, "Destination1");
        ArrayTools.display(byDestination);


        System.out.println("b:");
        Airlines[] byDayOfWeek = airlinesFilters.byDayOfWeek(airlines, DayOfWeek.THURSDAY);
        ArrayTools.display(byDayOfWeek);

        System.out.println("c:");
        Airlines[] byDayOfWeekAndTime = airlinesFilters.byDayOfWeekAndDepartureTime(airlines, DayOfWeek.THURSDAY, 10002);
        ArrayTools.display(byDayOfWeekAndTime);
           
        System.out.println("==================");
    }
}
