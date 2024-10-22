package case_study.model;

import java.util.Arrays;

public class VIPCustomer extends RegularCustomer {

    public VIPCustomer(String id, String name, String email, double ticketPrice, String[][] seats) {
        super(id, name, email, ticketPrice * 0.8, seats);  // Giảm 20%
    }

    @Override
    public String toString() {
        return "VIPCustomer [ID=" + getId() + ", Name=" + getName() + ", Email=" + getEmail() + ", Discounted Ticket Price=" + getTicketPrice()
                + ", Seats=" + Arrays.deepToString(getSeats()) + "]";
    }
}