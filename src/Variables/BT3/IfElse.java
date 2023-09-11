package Variables.BT3;

import java.util.Random;

public class IfElse {
    static int number = 100;
    public static void compare(int n) {
        if (n == number) {
            System.out.println(n + "\t" + "bằng" + "\t" + number);
        } else if (n < number) {
            System.out.println(n + "\t" + "nhỏ hơn" + "\t" + number);
        } else {
            System.out.println(n + "\t" + "lớn hơn" + "\t" + number);
        }
    }

    public static void main(String[] args) {
        Random rd = new Random();
        int a = rd.nextInt(1000);
        compare(a);

    }
}
