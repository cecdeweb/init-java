package fr.m2i;

public class Employe {
    private int id;
    private String firstName;
    private String lastName;
    public final static int AGE_RETRAITE=64;

    public Employe(int id,String firstName,String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int calculateSalary(int baseBase){
        return 56;
    }

/*
    public static toString(){
        return ;
    }
*/
}