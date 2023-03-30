import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        // wygeneruj tablice z losowymi liczbami (40 elementow)
        // program ma wyswietlac sume elementow tablicy

        //losowanie liczby (int)
        /*Random losowacz = new Random();
        int x = losowacz.nextInt(49) + 1;
        System.out.println(x);*/

        int[] tab = new int[40];
        Random losowacz = new Random();

        //generowanie losowej tablicy
        for(int i = 0; i < tab.length; i++) {
            tab[i] = losowacz.nextInt(101);
            System.out.print(tab[i] + " ");
        }

        //wyliczanie sumy
        int sum = 0;
        for(int element : tab) {
            sum = sum + element;
        }
        System.out.println();
        System.out.println(sum);
    }
}
