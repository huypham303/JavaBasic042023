package Variables.BT1;


public class SinhVien {
    //Bien Static
    static String address = "Hà Nội";
    static int age = 23;

    // Bien toan cuc
    String Course = "AnTester";

    // tao ra ham Local
    public static void HoVaTen(){
        String n = "Pham Dang Huy";
        System.out.println("Họ và Tên là: " + n);
    }

    //tao ham instance
    public static void Course(){
        SinhVien sv = new SinhVien();
        System.out.println("Đang học khóa học: " + sv.Course);
    }

    public static void Address(){
        System.out.println("Địa chỉ : " + address +
                             "\ntuổi: " + age);
    }



    public static void main(String[] args) {
        // local
        HoVaTen();

        // ínstance
        Course();

        // static
        Address();

        // goi ben class Thong tin
        System.out.println("Tình Trạng: " + ThongTin.status);
        System.out.println("Cách Thức Học: " + ThongTin.study);


    }
}
