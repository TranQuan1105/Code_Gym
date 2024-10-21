package case_study.model;

import java.util.Arrays;

public class Customer implements ICustomer {
    protected String id;
    protected String name;
    protected String email;
    protected double ticketPrice;
    private boolean isVIP;
    protected String[][] seats;

    public Customer(String id, String name, String email, double ticketPrice, String[][] seats) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.ticketPrice = ticketPrice;
        this.isVIP = isVIP;
        this.seats = seats;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }

    @Override
    public boolean isVIP() {
        return isVIP;
    }

    @Override
    public String[][] getSeats() {
        return seats;
    }

    @Override
    public void setSeats(String[][] seats) {
        this.seats = seats;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Customer [ID=" + id + ", Name=" + name + ", Email=" + email + ", Ticket Price=" + ticketPrice
                + ", Seats=" + Arrays.deepToString(seats) + "]";
    }
}
