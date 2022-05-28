package fr.m2i;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer number=null;
        // int primitif pas null

        while (number == null) {

            try {
                System.out.print("Entrez votre nombre :");
                number = scanner.nextInt(); // Exception potentiellement levée, donc la variable number reste à null
                break;
            } catch (InputMismatchException e) {
                System.out.println("Attention ! vous devez saisir un nombre !");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Mince une erreur !");
                return;
            }
        }
        scanner.close();
        for (int i = 1; i<= 10; i++){
            System.out.println(String.format("%d x %d = %d", number, i, number * i));
        }
    }
}