package ss14_sort_algorithm.Sap_xep_chen;


public class Sap_xep_chen {
    public static void main(String[] args) {
        int [] a = {2,53,215,52,2,55,23,12,16,69,5};
        System.out.println("Thuật toán sắp xếp chèn: ");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + ",");
        }
        insertion(a);
    }

    public static void insertion(int[] a){

        boolean needNextPass = true;

        for (int i = 1; i < a.length; i++){
            needNextPass = false;
            for (int j = 0; j < a.length -i; j++){
                if (a[j] > a[j + 1]){
                    System.out.println("Đổi " + a[j] + " với " + a[j + 1]);
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;

                    needNextPass = true;
                }
            }
            if (!needNextPass) {
                System.out.println("Mảng đã được sắp xếp");
                break;
            }
            System.out.print("Mảng phía sau phần tử thứ  " + i + " đã được sắp xếp: ");
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + "\t");
            }
            System.out.println();
        }
    }
}
