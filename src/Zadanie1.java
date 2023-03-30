public class Zadanie1 {
    public static void main(String[] args) {
        //program ma generować tablice liczb parzystycch startujc od 2

        //pierwsza wersja
        /*int x = 2;
        int[] tab = new int[20];

        for(int i = 0; i < 20; i++) {
            tab[i] = x;
            x = x + 2;
            System.out.print(tab[i] + " ");
        }*/

        //druga wersja
        /*int[] tab = new int[20];

        for(int i = 0, x = 2; i < 20; i++, x = x + 2) {
            tab[i] = x;
            System.out.print(tab[i] + " ");
        }*/

        //finalna wersja
        int[] tab = new int[20];

        for(int i = 0; i < tab.length; i++) {
            tab[i] = (i+1)*2;
            System.out.print(tab[i] + " ");
        }
    }
}
