package Task_11_Bus;

import Library.ArrayTools;
import Task_11_Bus.Logic.BusesFilters;
import Task_11_Bus.Models.Bus;

import java.time.LocalDate;

public class EleventhTaskExecutor {
    public static void start() {
        System.out.println("Task 11:");

        Bus[] buses = new Bus[]{
                new Bus("DriverInfo1", 11, 11, LocalDate.of(2020, 1, 1), 1000000),
                new Bus("DriverInfo2", 12, 12, LocalDate.of(1992, 1, 1), 2),
                new Bus("DriverInfo3", 11, 13, LocalDate.of(1993, 1, 1), 300000),
                new Bus("DriverInfo4", 14, 14, LocalDate.of(1994, 1, 1), 4)
        };

        BusesFilters busesFilters = new BusesFilters();
        System.out.println("a:");
        Bus[] byRoute = busesFilters.byRouteNumber(buses, 11);
        ArrayTools.display(byRoute);

        System.out.println("b:");
        Bus[] useLongerThanTenYears = busesFilters.byOperationStartMoreThen10Years(buses);
        ArrayTools.display(useLongerThanTenYears);

        System.out.println("c:");
        Bus[] mileageMoreThan100000 = busesFilters.byMileageMoreThan100000(buses);
        ArrayTools.display(mileageMoreThan100000);
        System.out.println("==================");
    }
}
