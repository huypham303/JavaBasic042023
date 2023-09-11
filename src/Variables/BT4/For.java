package Variables.BT4;

public class For {
    public static void main(String[] args) {
        // Khởi tạo biến
        int[] mang = new int[26];

        // Vòng lặp FOR để duyệt qua các số từ 0 đến 50
        for (int i = 0; i <= 50; i++) {
            // Kiểm tra nếu số là chẵn
            if (i % 2 == 0) {
                // Lưu số vào mảng
                mang[i / 2] = i;
            }
        }

        // In ra các số chẵn trong mảng
        for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i]);
        }
    }
}
