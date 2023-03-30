import java.util.Random;

public class Zadanie5 {
    public static void main(String[] args) {
        //program ma wyswietlac choinke o wysokosci w

        int w = 20;
        for(int i = 0; i < w; i++) {
            int s = w - i - 1;
            int g = i * 2 + 1;
            for(int j = 0; j < s; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < g; j++) {
                Random losowacz = new Random();
                int x = losowacz.nextInt(10);
                if(x == 0) {
                    System.out.print("o");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
