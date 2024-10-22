package case_study.repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import case_study.model.RegularCustomer;
import case_study.model.ICustomer;
import case_study.model.VIPCustomer;

public class CustomerRepository implements ICustomerRepository {
    private List<ICustomer> customers;
    private static final String PATH = "src/case_study/customer.csv";

    public CustomerRepository() {
        customers = readCustomersFromCSV();
    }

    @Override
    public List<ICustomer> getAllCustomers() {
        return customers;
    }

    @Override
    public void addCustomer(ICustomer customer) {
        customers.add(customer);
        writeCustomersToCSV(customers);
    }

    @Override
    public void updateCustomer(ICustomer customer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(customer.getId())) {
                customers.set(i, customer);
                break;
            }
        }
        writeCustomersToCSV(customers);
    }

    @Override
    public void deleteCustomer(String id) {
        customers.removeIf(customer -> customer.getId().equals(id));
        writeCustomersToCSV(customers);
    }

    @Override
    public ICustomer findCustomerById(String id) {
        for (ICustomer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public String[][] getAvailableSeats() {
        int rows = 3;
        int cols = 4;
        String[][] allSeats = new String[rows][cols];

        // Khởi tạo ghế
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                allSeats[i][j] = (char) ('A' + i) + String.valueOf(j + 1);
            }
        }

        // Đánh dấu ghế đã đặt
        for (ICustomer customer : customers) {
            for (String[] seatRow : customer.getSeats()) {
                for (String seat : seatRow) {
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            if (allSeats[i][j].equals(seat)) {
                                allSeats[i][j] = "X"; // X để đánh dấu ghế đã đặt
                            }
                        }
                    }
                }
            }
        }

        return allSeats;
    }

    // Phương thức đọc khách hàng từ file CSV
    private List<ICustomer> readCustomersFromCSV() {
        List<ICustomer> customers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String id = fields[0];
                String name = fields[1];
                String email = fields[2];
                double ticketPrice = Double.parseDouble(fields[3]);
                boolean isVIP = Boolean.parseBoolean(fields[4]);

                int rows = Integer.parseInt(fields[5]);
                int cols = Integer.parseInt(fields[6]);
                String[][] seats = new String[rows][cols];
                int seatIndex = 7;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        seats[i][j] = fields[seatIndex++];
                    }
                }

                if (isVIP) {
                    customers.add(new VIPCustomer(id, name, email, ticketPrice, seats));
                } else {
                    customers.add(new RegularCustomer(id, name, email, ticketPrice, seats));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customers;
    }

    // Phương thức ghi khách hàng vào file CSV
    private void writeCustomersToCSV(List<ICustomer> customers) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH))) {
            for (ICustomer customer : customers) {
                StringBuilder sb = new StringBuilder();
                sb.append(customer.getId()).append(",");
                sb.append(customer.getName()).append(",");
                sb.append(customer.getEmail()).append(",");
                sb.append(customer.getTicketPrice()).append(",");
                sb.append(customer instanceof VIPCustomer).append(",");

                // Ghi ghế ngồi
                String[][] seats = customer.getSeats();
                sb.append(seats.length).append(",").append(seats[0].length).append(",");
                for (String[] row : seats) {
                    for (String seat : row) {
                        sb.append(seat).append(",");
                    }
                }

                sb.setLength(sb.length() - 1);  // Xóa dấu phẩy cuối cùng
                bw.write(sb.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
