package Task_03_Patient;

import Library.ArrayTools;
import Task_03_Patient.Logic.PatientsFilters;
import Task_03_Patient.Models.Patient;

import java.util.Arrays;

public class ThirdTaskExecutor {
    public static void start() {
        System.out.println("Task 3:");

        Patient[] patients = new Patient[]{
                new Patient(1, "Surname1", "Name1", "Patronymic1", "Address1", "Phone1", "MedicineCardNumber1", "Diagnosis1"),
                new Patient(2, "Surname2", "Name2", "Patronymic2", "Address2", "Phone2", "MedicineCardNumber2", "Diagnosis1"),
                new Patient(3, "Surname3", "Name3", "Patronymic3", "Address3", "Phone3", "MedicineCardNumber3", "Diagnosis3")

        };
        PatientsFilters patientsFilters = new PatientsFilters();

        System.out.println("a:");
        Patient[] patientsWithSameDiagnosis = patientsFilters.byDiagnosis(patients, "Diagnosis1");
        ArrayTools.display(patientsWithSameDiagnosis);


        System.out.println("b:");
        Patient patient = patientsFilters.byCardNumber(patients, "MedicineCardNumber3");
        System.out.println(patient.toString());
        System.out.println("==================");

    }
}
