package Task_01_Student.Logic.Models;

import Task_01_Student.Models.Student;

public class GroupedFacultyModel {
    String facultyName;
    GroupedCourseModel[] courses;

    public GroupedFacultyModel(String facultyName, GroupedCourseModel[] courses) {
        this.facultyName = facultyName;
        this.courses = courses;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public GroupedCourseModel[] getCourses() {
        return courses;
    }

    public void setCourses(GroupedCourseModel[] courses) {
        this.courses = courses;
    }

}
