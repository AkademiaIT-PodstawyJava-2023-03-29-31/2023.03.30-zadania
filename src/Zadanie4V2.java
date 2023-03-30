import java.util.Random;

public class Zadanie4V2 {
    public static void main(String[] args) {
        // losujemy 20 liczb z przedzialu 0 - 30
        // program ma generowac tablice 20 elementowa z unikanymi wartosciami

        int[] tab = new int[20];
        Random losowacz = new Random();

        for(int i = 0; i < tab.length; i++) {
            boolean kolizja = true;
            int x = 0;
            while(kolizja) {
                kolizja = false;
                x = losowacz.nextInt(31);
                // sprawdzamy tylko liczby ktore juz
                // zostaly wylosowane (bez domyslnych zer)
                for(int j = 0; j < i; j++) {
                    if(tab[j] == x) {
                        kolizja = true;
                        //jesli znajde kolizje to juz dalej nie szukamy
                        break;
                    }
                }
            }
            tab[i] = x;
            System.out.print(tab[i] + " ");
        }
    }
}
