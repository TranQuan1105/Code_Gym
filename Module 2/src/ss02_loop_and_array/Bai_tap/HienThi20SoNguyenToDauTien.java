package ss02_loop_and_array.Bai_tap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        primeNumbers();
    }

    public static void primeNumbers(){
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if(i <= 2){
                System.out.println(i);
                count ++;
            } else {
                for (int j = 1; j < Math.sqrt(i); j++) {
                    if (i % j != 0){
                        System.out.println(i);
                        count++;
                    }
                }
            }
            if(count == 20){
                break;
            }
        }
    }


}
