package Task_07_Phone.Logic;

import Task_01_Student.Models.Student;
import Task_07_Phone.Models.Phone;

public class PhonesFilters {

    public Phone[] byHigherTalkingTime(Phone[] phones, int minTime){

        Phone[] resultPhones= new Phone[0];

        for (int i=0;i<phones.length;i++){
            Phone currentPhone=phones[i];

            if (currentPhone.getTalkTime()==minTime){

                Phone[] tmpArr= new Phone[resultPhones.length+1];
                for (int j=0;j<resultPhones.length;j++){
                    tmpArr[j]=resultPhones[j];
                }
                tmpArr[tmpArr.length-1]=currentPhone;
                resultPhones=tmpArr;
            }
        }
        return resultPhones;
    }
}
