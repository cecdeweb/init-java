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
    public void setId(int id) {
        this.id = id;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public byte getState() {
        return state;
    }
    public void setState(byte state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Client id=" + id + "\n"+
                "companyName=" + companyName + "\n"+
                "firstname=" + firstname + "\n"+
                "lastName=" + lastName + "\n"+
                "email=" + email + "\n"+
                "phone=" + phone + "\n"+
                "address=" + address + "\n"+
                "zipCode=" + zipCode + "\n"+
                "city=" + city + "\n"+
                "country=" + country + "\n"+
                "state=" + state + "\n\n";
    }
}
