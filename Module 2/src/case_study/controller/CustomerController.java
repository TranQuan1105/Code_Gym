package case_study.controller;

import case_study.service.CustomerService;
import case_study.view.ICustomerView;
import case_study.model.ICustomer;

import java.util.List;

public class CustomerController {
    private CustomerService customerService;
    private ICustomerView customerView;

    public CustomerController(CustomerService customerService, ICustomerView customerView) {
        this.customerService = customerService;
        this.customerView = customerView;
    }

    public void showAllCustomers() {
        List<ICustomer> customers = customerService.getAllCustomers();
        customerView.showCustomers(customers);
    }

    public void showCustomerById(String id) {
        ICustomer customer = customerService.findCustomerById(id);
        customerView.showCustomer(customer);
    }

    public void showAvailableSeats() {
        String[][] availableSeats = customerService.getAvailableSeats();
        customerView.showAvailableSeats(availableSeats);
    }

    public void addCustomer(String id, String name, String email, double ticketPrice, boolean isVIP, String[][] chosenSeats) {
        customerService.addCustomer(id, name, email, ticketPrice, isVIP, chosenSeats);
    }

    public ICustomer findCustomerById(String id) {
        return customerService.findCustomerById(id);
    }

    public void updateCustomer(ICustomer customer) {
        customerService.updateCustomer(customer);
    }

    public void deleteCustomer(String id) {
        customerService.deleteCustomer(id);
    }
}