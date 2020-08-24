package Task_02_Customer;

import Library.ArrayTools;
import Task_02_Customer.Logic.CustomersFilters;
import Task_02_Customer.Logic.CustomersGrouper;
import Task_02_Customer.Logic.Models.GroupedByNameCustomers;
import Task_02_Customer.Models.Customer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondTaskExecutor {
    public static void start() {
        System.out.println("Task 2:");
        Customer[] customers = new Customer[]{
                new Customer(1, "Surname1", "Name1", "Patronymic1", "Address1", "CardNumber1", "BankScoreNumber1"),
                new Customer(2, "Surname2", "Name1", "Patronymic2", "Address2", "CardNumber2", "BankScoreNumber2"),
                new Customer(3, "Surname3", "Name3", "Patronymic3", "Address3", "CardNumber3", "BankScoreNumber3")
        };
        CustomersFilters filters = new CustomersFilters();
        CustomersGrouper grouper = new CustomersGrouper();

        System.out.println("a:");
        GroupedByNameCustomers[] groupedByName = grouper.byName(customers);
        GroupedByNameCustomers[] customersWithSameName = filters.customersWithSameName(groupedByName);
        ArrayTools.display(customersWithSameName);

        System.out.println("b:");
        Customer customer = filters.byCardNumber(customers, "CardNumber3");
        System.out.println(customer.toString());
        System.out.println("==================");

    }
}
