import java.util.Random;

public class Zadanie {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random losowa = new Random();
        tab[0] = losowa.nextInt(15)*7;
        System.out.print(tab[0] + " ");
        for (int i = 1; i < 10; i++) {
            while (true) {
                int x = losowa.nextInt(15)*7;
                if (x >= tab[i-1]) {
                    tab[i] = x;
                    break;
                }
            }

            System.out.print(tab[i] + " ");
        }
    }
}
