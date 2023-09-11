package Variables.BT2;

public class Calculator {

    // Tạo hàm tính tổng 2 số nguyên
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // Tạo hàm tính tích 2 số thực
    public static double multiple(double num1, double num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        System.out.println("Tổng là: " + sum(10, 20));
        System.out.println("Tích là: " + multiple(3.4, 5.6) );
    }
}
