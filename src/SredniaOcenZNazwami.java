import java.util.Scanner;

public class SredniaOcenZNazwami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tablica przechowująca nazwy przedmiotów
        String[] nazwyPrzedmiotow = {
            "Matematyka",
            "Fizyka",
            "Chemia",
            "Język polski",
            "Język angielski"
        };

        // Pobieranie liczby ocen
        System.out.println("Podaj liczbę ocen: ");
        int liczbaOcen = scanner.nextInt();

        // Tablica do przechowywania ocen
        double[] oceny = new double[liczbaOcen];

        // Pobieranie ocen z poszczególnych przedmiotów
        for (int i = 0; i < liczbaOcen; i++) {
            System.out.println("Podaj ocenę z " + nazwyPrzedmiotow[i] + ": ");
            oceny[i] = scanner.nextDouble();
        }

        // Obliczanie średniej arytmetycznej
        double srednia = 0;
        for (double ocena : oceny) {
            srednia += ocena;
        }
        srednia /= liczbaOcen;

        // Wyświetlanie wyniku
        System.out.println("Średnia arytmetyczna ocen: " + srednia);
    }
}
