package case_study.repository;

import java.util.List;
import case_study.model.ICustomer;

public interface ICustomerRepository {
    List<ICustomer> getAllCustomers();
    void addCustomer(ICustomer customer);
    void updateCustomer(ICustomer customer);
    void deleteCustomer(String id);
    ICustomer findCustomerById(String id);
    String[][] getAvailableSeats();
}
