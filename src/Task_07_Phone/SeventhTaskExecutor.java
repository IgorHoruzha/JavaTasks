package Task_07_Phone;

import Library.ArrayTools;
import Task_07_Phone.Logic.PhoneSorter;
import Task_07_Phone.Logic.PhonesFilters;
import Task_07_Phone.Models.Phone;

public class SeventhTaskExecutor {
    public static void start() {
        System.out.println("Task 7:");
        Phone[] phones = new Phone[]{
                new Phone(4, "Surname4", "Name4", "Patronymic4", "Address4", "CreditCardNumber4", "Debit4", "Credit4", 100004),
                new Phone(3, "Surname3", "Name3", "Patronymic3", "Address3", "CreditCardNumber3", "Debit3", "Credit3", 100003),
                new Phone(2, "Surname2", "Name2", "Patronymic2", "Address2", "CreditCardNumber2", "Debit2", "Credit2", 100002),
                new Phone(1, "Surname1", "Name1", "Patronymic1", "Address1", "CreditCardNumber1", "Debit1", "Credit1", 100001),

        };

        PhonesFilters phonesFilters = new PhonesFilters();
        PhoneSorter phoneSorter = new PhoneSorter();

        System.out.println("a:");
        Phone[] bySpeakTime = phonesFilters.byHigherTalkingTime(phones, 100002);
        ArrayTools.display(bySpeakTime);

        System.out.println("b:");
        Phone[] orderedByName = phoneSorter.byNameAsc(phones);
        ArrayTools.display(orderedByName);


        System.out.println("==================");
    }
}
