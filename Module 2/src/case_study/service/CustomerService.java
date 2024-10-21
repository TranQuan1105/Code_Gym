package case_study.service;

import case_study.repository.ICustomerRepository;
import case_study.model.ICustomer;
import case_study.model.Customer;
import case_study.model.VIPCustomer;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository customerRepository;

    public CustomerService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void addCustomer(String id, String name, String email, double ticketPrice, boolean isVIP, String[][] chosenSeats) {
        ICustomer customer;
        if (isVIP) {
            customer = new VIPCustomer(id, name, email, ticketPrice, chosenSeats);
        } else {
            customer = new Customer(id, name, email, ticketPrice, chosenSeats);
        }
        customerRepository.addCustomer(customer);
    }

    @Override
    public void updateCustomer(ICustomer customer) {
        customerRepository.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.deleteCustomer(id);
    }

    @Override
    public ICustomer findCustomerById(String id) {
        return customerRepository.findCustomerById(id);
    }

    @Override
    public List<ICustomer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    @Override
    public String[][] getAvailableSeats() {
        return customerRepository.getAvailableSeats();
    }
}
