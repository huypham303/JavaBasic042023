package Variables.BT5;

import java.util.ArrayList;

public class Bt4_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            // Kiểm tra nếu số là chẵn
            if (i % 2 == 0) {
                // Lưu số vào mảng
                num.add(i);
            }
        }
        System.out.println(num);
    }
}
