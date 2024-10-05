package ss7_abstraction_tinhTruuTuong;

public class Teacher {
    private String position;

    public Teacher(int id, String name, String email, String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
