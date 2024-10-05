package ss6_inheritant_tinhKeThua_polymorphism_tinhDaHinh;

public class Parent {
    private String name;

    public Parent(){
    }
    public Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void saySth(){
        System.out.println("Lớp cha nói");
    }
}
