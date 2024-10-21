package ss2_LoopAndArray;

public class Array {
    public static void main(String[] args) {

//    Datatype[] arrName: Khai báo mảng
        // vd1: int[] number = {1,2,3,4};
        // vd2: String[] names = new String[3]; (khai báo một mảng có kiểu dữ liệu string
        // và có 3 phần tử)

        // lưu ý:
        // vd system.out.println(numbers.length);
        // khi đó .length là thuộc tính
        // còn có thêm cặp () thì là

        // nếu truy suất đến một mảng không có phần tử nào thì giá trị sẽ trả
        // về giá trị mặc định của kiểu dữ liệu

        String[] names = new String[3];
        names[0] = "Hello";
        names[1] = "mọi";
        names[2] = "người";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " ");
        }
        // Cách duy nhất để thực hành với mảng là sử dụng vòng lặp
    }
}
