package fr.m2i;

public class Users {

    private String id;
    private String lastname;
    private String firstname;
    private String email;
    private String mdp;

    public Users(String id, String lastname, String firstname, String email, String mdp) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.mdp = mdp;
    }

    public String getLastname() {
        return lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getEmail() {
        return email;
    }
    public String getMdp() {
        return mdp;
    }
    @Override
    public String toString() {
        return "Users{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}