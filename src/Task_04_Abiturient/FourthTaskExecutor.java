package Task_04_Abiturient;

import Library.ArrayTools;
import Task_04_Abiturient.Logic.AbiturientFilters;
import Task_04_Abiturient.Models.Abiturient;

public class FourthTaskExecutor {
    public static void start() {
        System.out.println("Task 4:");


        Abiturient[] abiturients = new Abiturient[]{
                new Abiturient(1, "Surname1", "Name1", "Patronymic1", "Address1", "Phone1", new int[]{12, 12, 12, 12, 12}),
                new Abiturient(2, "Surname2", "Name2", "Patronymic2", "Address2", "Phone2", new int[]{11, 11, 11, 11, 11}),
                new Abiturient(3, "Surname3", "Name3", "Patronymic3", "Address3", "Phone3", new int[]{3, 1, 5, 2, 3, 2, 1, 1}),
                new Abiturient(4, "Surname4", "Name4", "Patronymic4", "Address4", "Phone4", new int[]{8, 8, 8, 8, 8, 8})
        };

        AbiturientFilters abiturientFilters= new AbiturientFilters();

        System.out.println("a:");
        Abiturient[] hasBadMark= abiturientFilters.byLowerMarks(abiturients, 6);
        ArrayTools.display(hasBadMark);


        System.out.println("b:");
        Abiturient[] avgGoodMark= abiturientFilters.byHigherAvgMark(abiturients, 8);
        ArrayTools.display(avgGoodMark);

        System.out.println("c:");

        System.out.println("==================");
    }
}
