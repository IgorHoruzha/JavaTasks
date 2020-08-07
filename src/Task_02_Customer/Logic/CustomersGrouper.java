package Task_02_Customer.Logic;

import Task_01_Student.Models.Student;
import Task_02_Customer.Logic.Models.GroupedByNameCustomers;
import Task_02_Customer.Models.Customer;

public class CustomersGrouper {

    public  GroupedByNameCustomers[] byName(Customer[] customers){
        GroupedByNameCustomers[] groupedCustomers= new GroupedByNameCustomers[0];

        for (int i=0; i<customers.length;i++){
            Customer currentCustomer= customers[i];

            GroupedByNameCustomers potentialGroup= null;

            for (int j=0;j<groupedCustomers.length;j++){
                GroupedByNameCustomers currentGroup= groupedCustomers[j];

                if (currentGroup.getName().equals(currentCustomer.getName())){
                    potentialGroup=currentGroup;

                    break;
                }
            }

            if (potentialGroup==null){
                Customer[] potentialCustomers= new Customer[1];
                potentialCustomers[0]= currentCustomer;
                potentialGroup= new GroupedByNameCustomers(currentCustomer.getName(),potentialCustomers);

                GroupedByNameCustomers[] tmpArr= new GroupedByNameCustomers[groupedCustomers.length+1];
                for (int j=0;j<groupedCustomers.length;j++){
                    tmpArr[j]=groupedCustomers[j];
                }
                tmpArr[tmpArr.length-1]=potentialGroup;
                groupedCustomers=tmpArr;
            } else {
                Customer[] potentialCustomers = potentialGroup.getCustomers();

                Customer[] tmpArr= new Customer[potentialCustomers.length+1];
                for (int j=0;j<potentialCustomers.length;j++){
                    tmpArr[j]=potentialCustomers[j];
                }

                tmpArr[tmpArr.length-1]=currentCustomer;
                potentialGroup.setCustomers(tmpArr);
            }

        }

        return  groupedCustomers;
    }
}
