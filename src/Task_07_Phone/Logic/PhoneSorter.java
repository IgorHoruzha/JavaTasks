package Task_07_Phone.Logic;

import Task_04_Abiturient.Models.Abiturient;
import Task_07_Phone.Models.Phone;

public class PhoneSorter {

    public Phone[] byNameAsc(Phone[] phones) {

        int phonesLength = phones.length;
        Phone temp = null;

        for (int i = 0; i < phonesLength; i++) {
            for (int j = 1; j < (phonesLength - i); j++) {
                if (phones[j - 1].getName().compareTo(phones[j].getName()) > 0) {
                    temp = phones[j - 1];
                    phones[j - 1] = phones[j];
                    phones[j] = temp;
                }
            }
        }

        return phones;
    }
}
