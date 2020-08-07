package Task_04_Abiturient.Models;

import java.util.Arrays;

public class Abiturient {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String phone;
    private int[] marks;

    public Abiturient(int id, String surname, String name, String patronymic, String address, String phone, int[] marks) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int[] getMarks() {
        return marks;
    }


    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public  int getAvgMark(){

        int sum=0;
        for (int i=0;i<marks.length;i++){
            sum+=marks[i];
        }

        return Math.round(sum/marks.length);

    }

    @Override
    public String toString() {
        return "Enroller{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
