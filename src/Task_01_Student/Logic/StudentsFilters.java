package Task_01_Student.Logic;

import Task_01_Student.Models.Student;

public class StudentsFilters {

    public Student[] byFaculty( Student[] students,String faculty){

        Student[] resultStudents= new Student[0];//Создаем массив для всех подходящих по факультету студентов

        for (int i=0;i<students.length;i++){    //Перебераем всех студентов
            Student currentStudent=students[i];

            if (currentStudent.getFaculty().equals(faculty)){//Если факультет текущего студента равен переданому факультету добавить текущего студента в масив для всех подходящих студентов

                Student[] tmpArr= new Student[resultStudents.length+1];
                for (int j=0;j<resultStudents.length;j++){
                    tmpArr[j]=resultStudents[j];
                }
                tmpArr[tmpArr.length-1]=currentStudent;
                resultStudents=tmpArr;
            }
        }

        return resultStudents;//Возвращаем массив в котором находятся все подходящии по факультету студенты
    }

    public Student[] byGroup( Student[] students,String group){

        Student[] resultStudents= new Student[0];

        for (int i=0;i<students.length;i++){
            Student currStudent=students[i];

            if (currStudent.getGroup().equals(group)){

                Student[] tmpArr= new Student[resultStudents.length+1];
                for (int j=0;j<resultStudents.length;j++){
                    tmpArr[j]=resultStudents[j];
                }
                tmpArr[tmpArr.length-1]=currStudent;
                resultStudents=tmpArr;
            }
        }
        return resultStudents;
    }

    public Student[] burnAfterYear( Student[] students,int year){

        Student[] resultStudents= new Student[0];

        for (int i=0;i<students.length;i++){
            Student currStudent=students[i];

            if (currStudent.getBirthDay().getYear()<year){

                Student[] tmpArr= new Student[resultStudents.length+1];
                for (int j=0;j<resultStudents.length;j++){
                    tmpArr[j]=resultStudents[j];
                }
                tmpArr[tmpArr.length-1]=currStudent;
                resultStudents=tmpArr;
            }
        }
        return resultStudents;
    }

}
