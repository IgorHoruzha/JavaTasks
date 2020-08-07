package Task_08_Car.Logic;

import Task_01_Student.Models.Student;
import Task_08_Car.Models.Car;

import java.time.LocalDate;

public class CarsFilters {

    public Car[] byFaculty(Car[] cars, String brand){

        Car[] resultCars= new Car[0];

        for (int i=0;i<cars.length;i++){
            Car currentCar=cars[i];

            if (currentCar.getBrand().equals(brand)){

                Car[] tmpArr= new Car[resultCars.length+1];
                for (int j=0;j<resultCars.length;j++){
                    tmpArr[j]=resultCars[j];
                }
                tmpArr[tmpArr.length-1]=currentCar;
                resultCars=tmpArr;
            }
        }
        return resultCars;
    }

    public Car[] byFacultyAndMinReleaseDate(Car[] cars, String brand, LocalDate minReleaseDate){

        Car[] resultCars= new Car[0];

        for (int i=0;i<cars.length;i++){
            Car currentCar=cars[i];

            if (currentCar.getBrand().equals(brand)&&currentCar.getRelease().isAfter(minReleaseDate)){

                Car[] tmpArr= new Car[resultCars.length+1];
                for (int j=0;j<resultCars.length;j++){
                    tmpArr[j]=resultCars[j];
                }
                tmpArr[tmpArr.length-1]=currentCar;
                resultCars=tmpArr;
            }
        }
        return resultCars;
    }

    public Car[] byMinReleaseDateAndMinPrice(Car[] cars, LocalDate minReleaseDate, int minPrice){

        Car[] resultCars= new Car[0];

        for (int i=0;i<cars.length;i++){
            Car currentCar=cars[i];

            if (currentCar.getRelease().isAfter(minReleaseDate)&& currentCar.getPrice()>minPrice){

                Car[] tmpArr= new Car[resultCars.length+1];
                for (int j=0;j<resultCars.length;j++){
                    tmpArr[j]=resultCars[j];
                }
                tmpArr[tmpArr.length-1]=currentCar;
                resultCars=tmpArr;
            }
        }
        return resultCars;
    }
}
