package fr.m2i;

public class Calculator {

    int result;

    public int addition(int nbre1, int nbre2){
        result = nbre1 + nbre2;
        return result;
    }
    public int multiplication(int nbre1, int nbre2){
        result = nbre1 * nbre2;
        return result;
    }
    public int soustract(int nbre1, int nbre2){
        result = nbre1 - nbre2;
        return result;
    }
    public int division(int nbre1, int nbre2){
        result = nbre1 / nbre2;
        return result;
    }

}
