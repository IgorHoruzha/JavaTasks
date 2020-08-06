package Task_01_Student.Logic;

import Task_01_Student.Logic.Models.GroupedByFacultyThenByCourseModel;
import Task_01_Student.Logic.Models.GroupedCourseModel;
import Task_01_Student.Logic.Models.GroupedFacultyModel;
import Task_01_Student.Models.Student;

public class StudentsGrouper {

    public GroupedByFacultyThenByCourseModel byGroupThenByCourse(Student[] students) {
        GroupedFacultyModel[] faculties = new GroupedFacultyModel[0];


        for (int i = 0; i < students.length; i++) {
            Student student = students[i];

            GroupedFacultyModel potentialFaculty = null;
            for (int j = 0; j < faculties.length; j++) {

                GroupedFacultyModel currentFaculty = faculties[j];

                if (currentFaculty.getFacultyName().equals(student.getFaculty())) {
                    potentialFaculty = currentFaculty;
                    break;
                }
            }

            if (potentialFaculty == null) {
                Student[] newStudents = new Student[1];
                newStudents[0] = student;

                GroupedCourseModel groupedCourseModel = new GroupedCourseModel(student.getCourse(), newStudents);
                GroupedCourseModel[] newCourse = new GroupedCourseModel[1];
                newCourse[0] = groupedCourseModel;
                potentialFaculty = new GroupedFacultyModel(student.getFaculty(), newCourse);

                GroupedFacultyModel[] tmpArr = new GroupedFacultyModel[faculties.length + 1];
                for (int j = 0; j < faculties.length; j++) {
                    tmpArr[j] = faculties[j];
                }
                tmpArr[tmpArr.length - 1] = potentialFaculty;
                faculties = tmpArr;
            } else {

                GroupedCourseModel[] courses = potentialFaculty.getCourses();
                GroupedCourseModel potentialCourse = null;
                for (int j = 0; j < courses.length; j++) {

                    GroupedCourseModel currentCourse = courses[j];
                    if (currentCourse.getCourseName().equals(student.getCourse())) {

                        potentialCourse = currentCourse;
                        break;
                    }
                }

                if (potentialCourse == null) {

                    Student[] newStudents = new Student[1];
                    newStudents[0] = student;

                    potentialCourse = new GroupedCourseModel(student.getCourse(), newStudents);

                    GroupedCourseModel[] tmpArr = new GroupedCourseModel[courses.length + 1];
                    for (int j = 0; j < courses.length; j++) {
                        tmpArr[j] = courses[j];
                    }
                    tmpArr[tmpArr.length - 1] = potentialCourse;

                    potentialFaculty.setCourses(tmpArr);
                } else {

                    Student[] potentialStudents = potentialCourse.getStudents();
                    Student[] tmpArr = new Student[potentialStudents.length + 1];
                    for (int j = 0; j < potentialStudents.length; j++) {
                        tmpArr[j] = potentialStudents[j];
                    }
                    tmpArr[tmpArr.length - 1] = student;
                    potentialCourse.setStudents(tmpArr);
                }

            }


        }

        GroupedByFacultyThenByCourseModel groupedByFacultyThenByCourse = new GroupedByFacultyThenByCourseModel(faculties);

        return groupedByFacultyThenByCourse;
    }

}
