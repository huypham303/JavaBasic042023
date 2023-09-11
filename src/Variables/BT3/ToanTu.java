package Variables.BT3;

import java.util.Random;

public class ToanTu {


    static Random random = new Random();
    static int a = random.nextInt(100);
    static int b = random.nextInt(100);
    static int c = random.nextInt(100);


    public static void main(String[] args) {

        System.out.println(a + " " + b + " " + c);

        System.out.println(a > b && a > c);
        System.out.println(a > c || a < b);
        System.out.println(a == b);
        System.out.println(c == b);


    }
}
