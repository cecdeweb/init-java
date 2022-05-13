package fr.m2i;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    private final List<String> handledOperators = new ArrayList<String>() {{
        //création d'une liste des signes possible à utiliser
        add("+");
        add("-");
        add("*");
        add("/");
    }};

    public void start() throws Exception {
        // void ne return pas de valeur
        // throws Exception si gestion message erreurs hors try catch
        Long result = retrieveRequestedOperation();
        // on récupère les messages d'erreur de la méthode qui gère le try catch (traitement des données d'entrées)
        // ou la valeur null qui permet de traiter la condition suivante

        if (result == null) {
            throw new Exception("Une erreur est survenue !");
        }
        System.out.println(String.format("Résultat : %d", result));
        // si result est null affiche un message formaté
    }

    private Long retrieveRequestedOperation() {
        // méthode qui traite les sources d'erreur de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        // instancier la class Scanner permet de récupérer les messages de la console

        Long firstNumber = null;
        Long secondNumber = null;
        String operator = null;

        // On boucle tant que l'utilisateur ne rentre pas de valeur valide
        while (firstNumber == null || secondNumber == null || operator == null) {
            // Tant que firstNumber, secondNumber et operator sont vides on reste à l'interieur de la boucle
            try {
                System.out.print("Saisir le premier nombre : ");
                firstNumber = scanner.nextLong();
                // méthode typé nextLong() permet de récupérer la saisie de la console

                System.out.print("Saisir le deuxieme nombre : ");
                secondNumber = scanner.nextLong();

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
                // retourne une exception mathématique
                System.out.println("Désolé votre entré n'est pas valide\n");
                scanner.nextLine();
            } catch (Exception e) {
                // pour toutes autres exceptions
                System.out.println("Une erreur est survenue lorsqu'on récupère les entrés de l'utilisateur\n");
                return null;
            }
        }

        scanner.close();
        // on ferme l
        return calculate(firstNumber, secondNumber, operator);
    }

    protected Long calculate(Long firstNumber, Long secondNumber, String operator) {

        Long result;

        switch (operator) {

            case "+":
                result = sum(firstNumber, secondNumber);
                break;

            case "-":
                result = subtract(firstNumber, secondNumber);
                break;

            case "*":
                result = multiply(firstNumber, secondNumber);
                break;

            case "/":
                result = divide(firstNumber, secondNumber);
                break;

            default:
                result = null;
                break;
        }

        return result;
    }

    public long sum(long a, long b) {
        return a + b;
    }

    public long subtract(long a, long b) {
        return a - b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public long divide(long a, long b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("Il est impossible d'effectuer une division par 0 !");
        }

        return a / b;
    }
}