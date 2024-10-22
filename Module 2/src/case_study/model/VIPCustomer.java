package case_study.model;

import java.util.Arrays;

public class VIPCustomer extends Customer {

    public VIPCustomer(String id, String name, String email, double ticketPrice, String[][] seats) {
        super(id, name, email, ticketPrice * 0.8, seats);  // Giảm 20%
    }

    @Override
    public String toString() {
        return "VIPCustomer [ID=" + id + ", Name=" + name + ", Email=" + email + ", Discounted Ticket Price=" + ticketPrice
                + ", Seats=" + Arrays.deepToString(seats) + "]";
    }
}