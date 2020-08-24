package Task_04_Abiturient.Logic;

import Task_01_Student.Models.Student;
import Task_04_Abiturient.Models.Abiturient;

import java.util.Arrays;

public class AbiturientFilters {

    public Abiturient[] byLowerMarks(Abiturient[] abiturient, int maxMark) {
        Abiturient[] resultAbiturients = new Abiturient[0];

        for (int i = 0; i < abiturient.length; i++) {
            Abiturient currentAbiturient = abiturient[i];

            int[] currentMarks = currentAbiturient.getMarks();

            for (int j = 0; j < currentMarks.length; j++) {
                int currentMark = currentMarks[j];

                if (currentMark <= maxMark) {

                    Abiturient[] tmpArr = new Abiturient[resultAbiturients.length + 1];
                    for (int q = 0; q < resultAbiturients.length; q++) {
                        tmpArr[q] = resultAbiturients[q];
                    }
                    tmpArr[tmpArr.length - 1] = currentAbiturient;
                    resultAbiturients = tmpArr;
                    break;
                }
            }

        }
        return resultAbiturients;
    }

    public Abiturient[] byHigherAvgMark(Abiturient[] abiturient, int minAvgMark) {
        Abiturient[] resultAbiturients = new Abiturient[0];

        for (int i = 0; i < abiturient.length; i++) {
            Abiturient currentAbiturient = abiturient[i];
            int[] currentMarks = currentAbiturient.getMarks();
            int avgMark = 0;

            for (int j = 0; j < currentMarks.length; j++) {
                avgMark += currentMarks[j];
            }

            avgMark /= currentMarks.length;
            if (avgMark < minAvgMark) {
                continue;
            }

            Abiturient[] tmpArr = new Abiturient[resultAbiturients.length + 1];
            for (int q = 0; q < resultAbiturients.length; q++) {
                tmpArr[q] = resultAbiturients[q];
            }

            tmpArr[tmpArr.length - 1] = currentAbiturient;
            resultAbiturients = tmpArr;
        }

        return resultAbiturients;
    }


    public Abiturient[] topBeast(Abiturient[] abiturients, int count) {
        Abiturient[] resultAbiturients = new Abiturient[0];

        int abiturientsLength = abiturients.length;
        Abiturient temp = null;

        for (int i = 0; i < abiturientsLength && i < count; i++) {
            for (int j = 1; j < (abiturientsLength - i); j++) {
                if (abiturients[j - 1].getAvgMark() > abiturients[j].getAvgMark()) {
                    temp = abiturients[j - 1];
                    abiturients[j - 1] = abiturients[j];
                    abiturients[j] = temp;
                }

            }
        }

        int minCount = (abiturientsLength - count);

        for (int i = abiturientsLength; i < minCount; i--) {
            Abiturient[] tmpArr = new Abiturient[resultAbiturients.length + 1];
            for (int q = 0; q < resultAbiturients.length; q++) {
                tmpArr[q] = resultAbiturients[q];
            }

            tmpArr[tmpArr.length - 1] = abiturients[i - 1];
            resultAbiturients = tmpArr;
        }

        return resultAbiturients;
    }

}
