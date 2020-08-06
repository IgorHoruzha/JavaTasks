package Task_02_Customer.Models;

public class Customer {
    int id;
    String surname;
    String name;
    String patronymic;
    String address;
    String cardNumber;
    String bankScoreNumber;

    public Customer(
            int id,
            String surname,
            String name,
            String patronymic,
            String address,
            String cardNumber,
            String bankScoreNumber
    ) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankScoreNumber = bankScoreNumber;
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

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBankScoreNumber() {
        return bankScoreNumber;
    }

    public void setBankScoreNumber(String bankScoreNumber) {
        this.bankScoreNumber = bankScoreNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", bankScoreNumber='" + bankScoreNumber + '\'' +
                '}';
    }
}
