import java.util.Random;

public class Zadanie4 {
    public static void main(String[] args) {
        // losujemy 20 liczb z przedzialu 0 - 30
        // program ma generowac tablice 20 elementowa z unikanymi wartosciami

        int[] tab = new int[20];
        Random losowacz = new Random();

        //idzie po kolejnych elementach tablicy
        for(int i = 0; i < tab.length; i++) {
            // na starcie ustawiamy kolizje na true żeby odpaliła się petla while
            boolean kolizja = true;
            /*
            na starcie ustawiamy x na 0 - trzeba ta zmienna zainicjalizowac
            nie ma znaczenia ze to jest 0 bo i tak
            potem tam wstawiamy wylosowana liczbe
            */
            int x = 0;
            //wielokrotne lowosanie do momentu az znajdziemy unikalna liczbe
            while(kolizja /* == true */) {
                //resetujemy kolizje
                kolizja = false;
                x = losowacz.nextInt(31);
                //sprawdzamy w tablicy czy juz taka liczba jest wylosowana
                //jesli tak to ustawiamy kolizje na true
                //to powoduje ze petla while bedzie dzialac dalej
                for(int element : tab) {
                    if(element == x) {
                        kolizja = true;
                    }
                }
            }
            //jak wylosujemy x unikalny to wstawiamy go do tablicy
            tab[i] = x;
            System.out.print(tab[i] + " ");
        }
    }
}
