package fr.m2i;

public class Main {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        int nombre;

        try {
            System.out.print("Entrez le premier nombre : ");
            nombre = scanner.nextInt();
            scanner.close();

            // avec la boucle for l'utilisateur devra rafraichir la page pour avoir de nouveau la question
            // plutôt une boucle while pour demander à chaque fois que l'utilisateur se trompe

            for (int i = 0; i <= 10; i++) {
                int result = nombre * i;

                System.out.println(nombre + " x " + i + " = " + result);

/*              * Pas arrivé à faire affichage avec string.format à revoir
                String resultToFormat = "%d x %d = %d";
                String result = String.format(resultToFormat, nombre, i);
*/

            }
        } catch (InputMismatchException e) {
            System.out.println("Attention ! Tu es censé mettre un nombre entier");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}