package Task_02_Customer.Logic;

import Task_01_Student.Models.Student;
import Task_02_Customer.Models.Customer;

public class CustomersFilters {
    public  Customer byCardNumber(Customer[] customers,String cardNumber){

        for (int i=0;i<customers.length;i++){
            Customer currentCustomer=customers[i];

            if (currentCustomer.getCardNumber().equals(cardNumber)){
               return currentCustomer;
            }
        }

        return null;
    }
}
