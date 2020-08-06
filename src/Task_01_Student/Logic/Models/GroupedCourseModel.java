package Task_01_Student.Logic.Models;

import Task_01_Student.Models.Student;

public class GroupedCourseModel {

    String groupName;
    Student[] students;

    public GroupedCourseModel(String groupName, Student[] students) {
        this.groupName = groupName;
        this.students = students;
    }

    public String getCourseName() {
        return groupName;
    }

    public void setCourseName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
