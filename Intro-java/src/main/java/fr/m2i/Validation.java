package fr.m2i;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Validation {

    public static boolean isEmail(String email){
        return Pattern.matches(".+@.+\\..+", email);
    }

    public static boolean isLength(String mdp){
        return mdp.length() >= 8 && mdp.length() <= 20;
    }

    public static boolean checkUser(ArrayList<Users> users, String email, String mdp){
        for (Users user: users) {
            if (user.getEmail().equals(email) && user.getMdp().equals(mdp)){
                System.out.println("Bienvenue," + user.getFirstname() + " " + user.getLastname());
                return true;
            }
        }
        return false;
    }

}