package Variables.BT5;

import java.util.ArrayList;

public class Add_Information {
    public String myName;
    public String role;

    public Add_Information() {
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Add_Information(String myName, String role) {
        this.myName = myName;
        this.role = role;
    }

    @Override
    public String toString() {
        return
                "(" + myName + ", "
                        + role + ")";
    }

    public static void main(String[] args) {
        // create array list
        ArrayList<Add_Information> list_Info = new ArrayList<>();

        // add information into array list
        list_Info.add(new Add_Information("Huy", "manual Test"));
        list_Info.add(new Add_Information("Huy1", "devops"));
        list_Info.add(new Add_Information("Huy2", "auto Test"));

        for (Add_Information nhanvien : list_Info) {
            System.out.println(nhanvien.toString());
        }

    }
}
