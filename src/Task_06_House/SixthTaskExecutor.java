package Task_06_House;

import Library.ArrayTools;
import Task_06_House.Logic.HousesFilters;
import Task_06_House.Models.House;

public class SixthTaskExecutor {
    public static void start() {
        System.out.println("Task 6:");
        House[] houses = new House[]{
                new House(1, 1, 100, 10, 1, "Street1", "BuildingType1", 1),
                new House(2, 2, 200, 20, 2, "Street2", "BuildingType2", 2),
                new House(3, 3, 201, 30, 2, "Street3", "BuildingType3", 3),
                new House(4, 4, 400, 40, 4, "Street4", "BuildingType4", 4)
        };

        HousesFilters housesFilters = new HousesFilters();

        System.out.println("a:");
        House[] byRoomsCount = housesFilters.byRooms(houses, 2);
        ArrayTools.display(byRoomsCount);

        System.out.println("b:");
        House[] byFilter = housesFilters.byRoomsAndFlor(houses, 2, 30, 40);
        ArrayTools.display(byFilter);

        System.out.println("c:");
        House[] byArea= housesFilters.byHigherArea(houses,200);
        ArrayTools.display(byArea);

        System.out.println("==================");
    }
}
