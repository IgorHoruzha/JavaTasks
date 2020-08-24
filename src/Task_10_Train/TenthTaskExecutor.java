package Task_10_Train;

import Library.ArrayTools;
import Task_10_Train.Logic.TrainsFilters;
import Task_10_Train.Models.Train;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TenthTaskExecutor {
    public static void start() {
        System.out.println("Task 10:");
        Train[] train = new Train[]{
                new Train("Destination1", 1, LocalDateTime.of(1994, 1, 1, 1, 1, 1), 101),
                new Train("Destination2", 2, LocalDateTime.of(1992, 2, 2, 2, 2, 2), 102),
                new Train("Destination3", 3, LocalDateTime.of(1993, 3, 3, 3, 3, 3), 103),
                new Train("Destination1", 4, LocalDateTime.of(1994, 4, 4, 4, 4, 4), 0)
        };

        TrainsFilters trainsFilters = new TrainsFilters();

        System.out.println("a:");
        Train[] byDestination = trainsFilters.byDestination(train, "Destination1");
        ArrayTools.display(byDestination);

        System.out.println("b:");
        Train[] byDestinationAndTime = trainsFilters.byDestinationAndAfterTime(train, "Destination1", LocalDateTime.of(1994, 1, 1, 2, 1, 1));
        ArrayTools.display(byDestinationAndTime);

        System.out.println("c:");
        Train[] byDestinationAndPlaces = trainsFilters.byDestinationAndHasPlace(train, "Destination1");
        ArrayTools.display(byDestinationAndPlaces);

        System.out.println("==================");
    }
}
