public class Zadanie2 {
    public static void main(String[] args) {
        /*
        generujemy tablice 100 elementowa z
        liczbami 0,1,2,3,4,5.... (kolejne liczby)
        program ma wypisac na ekranie tylko te liczby z talicy
        ktore sa podzielne przez 2 i przez 3 jednoczesnie
         */

        int[] tab = new int[100];
        for(int i = 0; i < tab.length; i++) {
            tab[i] = i;
        }

        for(int element : tab) {
            if(element % 2 == 0 && element % 3 == 0 && element != 0) {
                System.out.print(element + " ");
            }
        }
    }
}
