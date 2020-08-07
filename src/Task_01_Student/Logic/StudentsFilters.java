package Task_01_Student.Logic;

import Task_01_Student.Models.Student;

public class StudentsFilters {

    public Student[] byFaculty( Student[] students,String faculty){

        Student[] resultStudents= new Student[0];

        for (int i=0;i<students.length;i++){
            Student currentStudent=students[i];

            if (currentStudent.getFaculty().equals(faculty)){

                Student[] tmpArr= new Student[resultStudents.length+1];
                for (int j=0;j<resultStudents.length;j++){
                    tmpArr[j]=resultStudents[j];
                }
                tmpArr[tmpArr.length-1]=currentStudent;
                resultStudents=tmpArr;
            }
        }
        return resultStudents;
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
