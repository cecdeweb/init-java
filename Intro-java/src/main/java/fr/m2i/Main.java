package fr.m2i;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Apple a = new Apple();
        a.taste();
        a.miam();

        PineApple b = new PineApple();
        b.taste();
        b.miam();

    }
}