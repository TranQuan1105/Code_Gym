package case_study.service;

import case_study.model.ICustomer;

import java.util.List;

public interface ICustomerService {
    void addCustomer(String id, String name, String email, double ticketPrice, boolean isVIP, String[][] chosenSeats);
    void updateCustomer(ICustomer customer);
    void deleteCustomer(String id);
    ICustomer findCustomerById(String id);
    List<ICustomer> getAllCustomers();
    String[][] getAvailableSeats();
}