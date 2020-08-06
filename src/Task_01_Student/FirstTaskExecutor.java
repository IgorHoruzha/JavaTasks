package Task_01_Student;

import Library.ArraysShower;
import Task_01_Student.Logic.Models.GroupedByFacultyThenByCourseModel;
import Task_01_Student.Logic.StudentsFilters;
import Task_01_Student.Logic.StudentsGrouper;
import Task_01_Student.Models.Student;

import java.time.LocalDate;

public class FirstTaskExecutor {


       public static void start() {


        System.out.println("Task 1:");
           Student[] students= new Student[]{
                   new Student(0,"Surname0","Name0","Patronymic0", LocalDate.of(1990,1,1),"Address0","Phone0","faculty0","course0","group0"),
                   new Student(1,"Surname1","Name1","Patronymic1", LocalDate.of(1991,1,1),"Address1","Phone1","faculty0","course0","group0"),
                   new Student(2,"Surname2","Name2","Patronymic2", LocalDate.of(1992,2,2),"Address2","Phone2","faculty0","course0","group0"),
                   new Student(3,"Surname3","Name3","Patronymic3", LocalDate.of(1993,3,3),"Address3","Phone3","faculty0","course1","group3"),
                   new Student(4,"Surname4","Name4","Patronymic4", LocalDate.of(1994,4,4),"Address4","Phone4","faculty0","course1","group4"),
                   new Student(5,"Surname5","Name5","Patronymic5", LocalDate.of(1995,5,5),"Address5","Phone5","faculty1","course2","group4"),
                   new Student(6,"Surname6","Name6","Patronymic6", LocalDate.of(1996,6,6),"Address6","Phone6","faculty1","course2","group5"),
                   new Student(7,"Surname7","Name7","Patronymic7", LocalDate.of(1997,7,7),"Address7","Phone7","faculty1","course3","group5"),
                   new Student(8,"Surname8","Name8","Patronymic8", LocalDate.of(1998,8,8),"Address8","Phone8","faculty1","course4","group5"),
                   new Student(9,"Surname9","Name9","Patronymic9", LocalDate.of(1999,9,9),"Address9","Phone9","faculty2","course5","group9"),
           };

           System.out.println("All students:");
           ArraysShower.Show(students);
           StudentsFilters studentsFilters= new StudentsFilters();

        System.out.println("a:");
        var filteredByFaculty=studentsFilters.byFaculty(students,"faculty1");
           ArraysShower.Show(filteredByFaculty);
        System.out.println("b:");
           StudentsGrouper studentsGrouper= new StudentsGrouper();
           GroupedByFacultyThenByCourseModel groupedStudents = studentsGrouper.byGroupThenByCourse(students);

        System.out.println("c:");
        System.out.println("d:");

        System.out.println("==================");

    }

}
