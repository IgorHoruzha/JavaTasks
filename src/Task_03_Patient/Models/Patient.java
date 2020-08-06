package Task_03_Patient.Models;

public class Patient {


    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String phone;
    private String medicineCardNumber;
    private String diagnosis;

    public Patient(int id, String surname, String name, String patronymic, String address, String phone, String medicineCardNumber, String diagnosis) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.medicineCardNumber = medicineCardNumber;
        this.diagnosis = diagnosis;
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

    public String getMedicineCardNumber() {
        return medicineCardNumber;
    }

    public void setMedicineCardNumber(String medicineCardNumber) {
        this.medicineCardNumber = medicineCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", medicineCardNumber='" + medicineCardNumber + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
