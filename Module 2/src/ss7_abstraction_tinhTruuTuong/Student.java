package ss7_abstraction_tinhTruuTuong;

public class Student {
    private String className;

    public Student(int id, String name, String email, String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
