package Task_01_Student.Logic.Models;




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
}


