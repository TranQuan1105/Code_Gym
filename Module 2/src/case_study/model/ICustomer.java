package case_study.model;

public interface ICustomer {
    String getId();
    String getName();
    String getEmail();
    double getTicketPrice();
    String[][] getSeats();

    void setName(String name);
    void setEmail(String email);
    void setTicketPrice(double ticketPrice);
    void setSeats(String[][] seats);

    String toString();

    boolean isVIP();
}