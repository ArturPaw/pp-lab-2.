import java.util.Scanner;

public class SredniaOcenZNazwami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        String[] nazwyPrzedmiotow = {
            "Matematyka",
            "Fizyka",
            "Chemia",
            "Język polski",
            "Język angielski"
        };

        
        System.out.println("Podaj liczbę ocen: ");
        int liczbaOcen = scanner.nextInt();

       
        double[] oceny = new double[liczbaOcen];

        
        for (int i = 0; i < liczbaOcen; i++) {
            System.out.println("Podaj ocenę z " + nazwyPrzedmiotow[i] + ": ");
            oceny[i] = scanner.nextDouble();
        }

        
        double srednia = 0;
        for (double ocena : oceny) {
            srednia += ocena;
        }
        srednia /= liczbaOcen;

      
        System.out.println("Średnia arytmetyczna ocen: " + srednia);
    }
}
