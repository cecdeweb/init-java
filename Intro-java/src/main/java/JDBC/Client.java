package JDBC;

public class Client {

    private int id;
    private String companyName;
    private String firstname;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String zipCode;
    private String city;
    private String country;
    private byte state;

    public Client(int id, String companyName, String firstname, String lastName, String email, String phone, String address, String zipCode, byte state) {
        this.id = id;
        this.companyName = companyName;
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public byte getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", state=" + state +
                '}';
    }
}
