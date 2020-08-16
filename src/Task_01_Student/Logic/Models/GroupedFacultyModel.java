package Task_01_Student.Logic.Models;

import Task_01_Student.Models.Student;

import java.util.Arrays;

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

    @Override
    public String toString() {
        return "GroupedFacultyModel{" +
                "facultyName='" + facultyName + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
