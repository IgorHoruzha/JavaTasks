package Task_01_Student.Logic.Models;


import java.util.Arrays;

public class GroupedByFacultyThenByCourseModel {

    GroupedFacultyModel[] faculties;

    public GroupedByFacultyThenByCourseModel(GroupedFacultyModel[] faculties) {
        this.faculties = faculties;
    }

    public GroupedFacultyModel[] getFaculties() {
        return faculties;
    }

    public void setFaculties(GroupedFacultyModel[] faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "GroupedByFacultyThenByCourseModel{" +
                "faculties=" + Arrays.toString(faculties) +
                '}';
    }
}


