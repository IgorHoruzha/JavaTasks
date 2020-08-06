package Task_07_Phone.Models;

public class Phone {
    int id;
    String surname;
    String name;
    String patronymic;
    String address;
    String creditCardNumber;
    String debit;
    String credit;
    long talkTime;

    public Phone(int id, String surname, String name, String patronymic, String address, String creditCardNumber, String debit, String credit, long talkTime) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.debit = debit;
        this.credit = credit;
        this.talkTime = talkTime;
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

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getDebit() {
        return debit;
    }

    public void setDebit(String debit) {
        this.debit = debit;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public long getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(long talkTime) {
        this.talkTime = talkTime;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", debit='" + debit + '\'' +
                ", credit='" + credit + '\'' +
                ", talkTime=" + talkTime +
                '}';
    }
}
