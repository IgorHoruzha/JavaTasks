package Task_03_Patient.Logic;

import Task_01_Student.Models.Student;
import Task_02_Customer.Models.Customer;
import Task_03_Patient.Models.Patient;

public class PatientsFilters {

    public Patient[] byDiagnosis(Patient[] patients,String diagnosis){

        Patient[] resultPatients= new Patient[0];

        for (int i=0;i<patients.length;i++){
            Patient currStudent=patients[i];

            if (currStudent.getDiagnosis().equals(diagnosis)){

                Patient[] tmpArr= new Patient[resultPatients.length+1];
                for (int j=0;j<resultPatients.length;j++){
                    tmpArr[j]=resultPatients[j];
                }
                tmpArr[tmpArr.length-1]=currStudent;
                resultPatients=tmpArr;
            }
        }
        return resultPatients;
    }

    public Patient byCardNumber(Patient[] patients, String medicineCardNumber){

        for (int i=0;i<patients.length;i++){
            Patient currentPatient=patients[i];

            if (currentPatient.getMedicineCardNumber().equals(medicineCardNumber)){
                return currentPatient;
            }
        }

        return null;
    }
}
