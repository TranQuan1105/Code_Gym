package case_study;

import case_study.controller.CustomerController;
import case_study.repository.CustomerRepository;
import case_study.service.CustomerService;
import case_study.view.CustomerView;
import case_study.model.ICustomer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepository();
        CustomerService customerService = new CustomerService(customerRepository);
        CustomerView customerView = new CustomerView();
        CustomerController customerController = new CustomerController(customerService, customerView);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChọn chức năng:");
            System.out.println("1. Thêm khách hàng");
            System.out.println("2. Hiển thị tất cả khách hàng");
            System.out.println("3. Tìm khách hàng theo ID");
            System.out.println("4. Cập nhật thông tin khách hàng");
            System.out.println("5. Xóa khách hàng");
            System.out.println("6. Hiển thị ghế trống");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Nhập thông tin khách hàng
                    System.out.println("Nhập thông tin khách hàng:");

                    System.out.print("ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Tên: ");
                    String name = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Giá vé: ");
                    double ticketPrice = scanner.nextDouble();

                    System.out.print("Khách hàng VIP? (true/false): ");
                    boolean isVIP = scanner.nextBoolean();
                    scanner.nextLine();

                    int rows = 4; // 5 hàng
                    int cols = 6; // 4 cột
                    String[][] seats = new String[rows][cols];
                    System.out.print("Nhập số lượng ghế muốn đặt: ");
                    int numberOfSeats = scanner.nextInt();
                    scanner.nextLine();
                    displaySeats(seats);
                    for (int i = 0; i < numberOfSeats; i++) {
                        System.out.print("Nhập ghế bạn muốn đặt (ví dụ: 1A): ");
                        String chosenSeat = scanner.nextLine().toUpperCase();

                        int chosenRow = Integer.parseInt(chosenSeat.substring(0, chosenSeat.length() - 1)) - 1;
                        char chosenColChar = chosenSeat.charAt(chosenSeat.length() - 1);
                        int chosenCol = chosenColChar - 'A';
                        if (chosenRow < 0 || chosenRow >= seats.length || chosenCol < 0 || chosenCol >= seats[chosenRow].length) {
                            System.out.println("Ghế không hợp lệ. Vui lòng nhập lại.");
                            i--;
                            continue;
                        }

                        if (seats[chosenRow][chosenCol] == null || !seats[chosenRow][chosenCol].equals(" X")) {
                            seats[chosenRow][chosenCol] = "X";
                            System.out.println("Ghế " + chosenSeat + " đã được đặt thành công.");
                        } else {
                            System.out.println("Ghế " + chosenSeat + " đã được đặt. Vui lòng chọn ghế khác.");
                            i--;
                        }
                    }

                    System.out.println("Danh sách ghế ngồi sau khi đặt:");
                    displaySeats(seats);

                    // Thêm khách hàng
                    customerController.addCustomer(id, name, email, ticketPrice * numberOfSeats, isVIP, seats);
                    break;

                case 2:
                    // Hiển thị tất cả khách hàng
                    customerController.showAllCustomers();
                    break;

                case 3:
                    // Tìm khách hàng theo ID
                    System.out.print("Nhập ID khách hàng cần tìm: ");
                    String searchId = scanner.nextLine();
                    customerController.showCustomerById(searchId);
                    break;

                case 4:
                    /* Cập nhật thông tin khách hàng
                    System.out.print("Nhập ID khách hàng cần cập nhật: ");
                    String updateId = scanner.nextLine();
                    ICustomer customerToUpdate = customerController.findCustomerById(updateId);
                    if (customerToUpdate != null) {
                        System.out.println("Nhập thông tin mới:");

                        System.out.print("Tên (hiện tại: " + customerToUpdate.getName() + "): ");
                        String newName = scanner.nextLine();
                        customerToUpdate.setName(newName);

                        System.out.print("Email (hiện tại: " + customerToUpdate.getEmail() + "): ");
                        String newEmail = scanner.nextLine();
                        customerToUpdate.setEmail(newEmail);

                        System.out.print("Giá vé (hiện tại: " + customerToUpdate.getTicketPrice() + "): ");
                        double newTicketPrice = scanner.nextDouble();
                        customerToUpdate.setTicketPrice(newTicketPrice);
                        scanner.nextLine(); // Đọc bỏ ký tự newline

                        System.out.print("Khách hàng VIP? (hiện tại: " + customerToUpdate.isVIP() + ") (true/false): ");
                        boolean newIsVIP = scanner.nextBoolean();
                        scanner.nextLine();


                        int newRows = 4;
                        int newCols = 6;
                        String[][] newSeats = new String[newRows][newCols];

                        String[][] newSeats = new String[newRows][newCols];
                        System.out.println("Nhập các ghế mới (ví dụ: A1, A2): ");

                        customerToUpdate.setSeats(newSeats);
                        customerController.updateCustomer(customerToUpdate);
                    } else {
                        System.out.println("Không tìm thấy khách hàng với ID: " + updateId);
                    }*/
                    System.out.println("Đang trong quá trình hoàn thiện");
                    break;

                case 5:
                    // Xóa khách hàng
                    System.out.print("Nhập ID khách hàng cần xóa: ");
                    String deleteId = scanner.nextLine();
                    ICustomer customerToDelete = customerController.findCustomerById(deleteId);

                    if (customerToDelete != null) {
                        System.out.println("Bạn có chắc muốn xóa khách hàng này không?");
                        System.out.println("ID: " + customerToDelete.getId() +
                                ", Tên: " + customerToDelete.getName() +
                                ", Email: " + customerToDelete.getEmail());
                        System.out.print("Nhập 'yes' để xác nhận, hoặc 'no' để hủy: ");
                        String confirmation = scanner.nextLine();

                        if ("yes".equalsIgnoreCase(confirmation)) {
                            customerController.deleteCustomer(deleteId);
                            System.out.println("Khách hàng với ID " + deleteId + " đã được xóa.");
                        } else {
                            System.out.println("Xóa khách hàng đã bị hủy.");
                        }
                    } else {
                        System.out.println("Không tìm thấy khách hàng với ID: " + deleteId);
                    }
                    break;

                case 6:
                    customerController.showAvailableSeats();
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }

        } while (choice != 0);

        scanner.close();
    }

    private static void displaySeats(String[][] seats) {
        System.out.println("Danh sách ghế ngồi:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                String seatName = (i + 1) + String.valueOf((char) ('A' + j));
                if (seats[i][j] != null && seats[i][j].equals("X")) {
                    System.out.print(" X ");
                } else {
                    System.out.print(seatName + " ");
                }
            }
            System.out.println();
        }
    }
}