package fr.m2i;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        Integer result = null;

        Integer firstNumber = null;
        Integer secondNumber = null;
        String operator = null;

        List<String> handledOperators = new ArrayList<String>();

        handledOperators.add("+");
        handledOperators.add("-");
        handledOperators.add("*");
        handledOperators.add("/");

        // On boucle tant que l'utilisateur ne rentre pas de valeur valide
        while (firstNumber == null || secondNumber == null || operator == null) { // Tant que firstNumber, secondNumber et operator sont vides on reste à l'interieur de la boucle
            try {
                System.out.print("Saisir le premier nombre : ");
                firstNumber = scanner.nextInt();

                System.out.print("Saisir le deuxieme nombre : ");
                secondNumber = scanner.nextInt();

                System.out.print("Saisir l'opérateur arithmetique (+, -, *, /) : ");
                operator = scanner.next();

                // On cherche a savoir si l'opérateur entré par l'utilisateur est dans la liste des opérateurs que l'on sait gérer
                // On inverse avec le ! la valeur de retour de la method contains afin de rentrer dans notre gestion d'erreur
                // dans le cas où l'opérateur n'est pas la liste
                if (!handledOperators.contains(operator)) {
                    System.out.println(String.format("Votre opérateur [%s] n'est pas valide !\n", operator));
                    operator = null; // On force la variable operator à null pour pouvoir continuer à itérer dans notre boucle
                }
            } catch (InputMismatchException ime) {
                System.out.println("Désolé votre entré n'est pas valide\n");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Une erreur est survenue\n");
                return;
            }
        }

        scanner.close();

        switch (operator) {

            case "+":
                result = myCalculator.sum(firstNumber, secondNumber);
                break;

            case "-":
                result = myCalculator.subtract(firstNumber, secondNumber);
                break;

            case "*":
                result = myCalculator.multiply(firstNumber, secondNumber);
                break;

            case "/":
                result = myCalculator.divide(firstNumber, secondNumber);
                break;
        }

        System.out.println(String.format("Opération demandée : %d %s %d", firstNumber, operator, secondNumber));
        System.out.println(String.format("Résultat : %d", result));
    }
}