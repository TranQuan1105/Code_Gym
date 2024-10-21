package case_study.view;

import case_study.model.ICustomer;

import java.util.List;

public interface ICustomerView {
    void showCustomers(List<ICustomer> customers);
    void showCustomer(ICustomer customer);
    void showAvailableSeats(String[][] seats);
}
