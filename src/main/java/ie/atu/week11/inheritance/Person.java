package ie.atu.week11.inheritance;

public class Person {
    private String name;
    private String address;
    private String telephoneNumber;

    public Person() {
    }

    public Person(String name, String address, String telephoneNumber) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String toString() {
        return "NAME: " + name + "ADDRESS: " + address + "TELEPHONE: " + telephoneNumber;
    }
}
