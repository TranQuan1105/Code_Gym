package ss6_inheritant_tinhKeThua_polymorphism_tinhDaHinh;

public class Management {
    /*
     * Lớp con  có thể kế thừa các thuộc tính, hành vi không phải là private của lớp cha
     * Lớp con không thể kế thừa constructor của lớp cha
     * Trong Java chỉ cho phép đơn kế thừa, không cho phép đa kế thừa
     * */
    public static void main(String[] args) {
        Child child = new Child();
        child.setName("con");
        System.out.println(child.getName());
        child.saySth();
    }
}