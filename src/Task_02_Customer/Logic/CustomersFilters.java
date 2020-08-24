package Task_02_Customer.Logic;

import Task_01_Student.Models.Student;
import Task_02_Customer.Logic.Models.GroupedByNameCustomers;
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

    public  GroupedByNameCustomers[] customersWithSameName( GroupedByNameCustomers[] groupedByName){
        GroupedByNameCustomers[] customersWithSameName= new GroupedByNameCustomers[0];
        for (int i=0;i<groupedByName.length;i++){

            GroupedByNameCustomers currentCustomerGroup=groupedByName[i];
            if (currentCustomerGroup.getCustomers().length>1){
                GroupedByNameCustomers[] tmpArr= new GroupedByNameCustomers[customersWithSameName.length+1];
                for (int j=0;j<customersWithSameName.length;j++){
                    tmpArr[j]=customersWithSameName[j];
                }
                tmpArr[tmpArr.length-1]=currentCustomerGroup;
                customersWithSameName=tmpArr;
            }
        }
        return customersWithSameName;
    }
}
