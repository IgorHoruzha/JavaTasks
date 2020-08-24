package Task_08_Car;

import Library.ArrayTools;
import Task_08_Car.Logic.CarsFilters;
import Task_08_Car.Models.Car;

import java.time.LocalDate;

public class EightTaskExecutor {
    public static void start() {
        System.out.println("Task 8:");

        Car[] cars = new Car[]{
                new Car(1, "Brand1", "Model1", LocalDate.of(1994, 1, 1), "Colour1", 101, "RegistrationNumber1"),
                new Car(2, "Brand2", "Model2", LocalDate.of(1992, 1, 1), "Colour2", 102, "RegistrationNumber2"),
                new Car(3, "Brand1", "Model3", LocalDate.of(1993, 1, 1), "Colour3", 103, "RegistrationNumber3"),
                new Car(4, "Brand2", "Model4", LocalDate.of(1994, 1, 1), "Colour4", 104, "RegistrationNumber4")
        };

        CarsFilters carsFilters = new CarsFilters();

        System.out.println("a:");
        Car[] byBrad = carsFilters.byBrand(cars, "Brand1");
        ArrayTools.display(byBrad);

        System.out.println("b:");
        Car[] byBrandAndUseTime = carsFilters.byBrandAndMinReleaseDate(cars, "Brand2", LocalDate.of(1993, 1, 1));
        ArrayTools.display(byBrandAndUseTime);

        System.out.println("c:");
        Car[] higherPrice= carsFilters.byMinReleaseDateAndMinPrice(cars, LocalDate.of(1993,1,1),100);
        ArrayTools.display(higherPrice);

        System.out.println("==================");
    }
}

