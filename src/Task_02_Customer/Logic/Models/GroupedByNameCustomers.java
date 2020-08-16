package Task_02_Customer.Logic.Models;

import Task_02_Customer.Models.Customer;

import java.util.Arrays;

public class GroupedByNameCustomers {
    String name;
    Customer[] customers;

    public GroupedByNameCustomers(String name, Customer[] customers) {
        this.name = name;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "GroupedByNameCustomers{" +
                "name='" + name + '\'' +
                ", customers=" + Arrays.toString(customers) +
                '}';
    }
}
