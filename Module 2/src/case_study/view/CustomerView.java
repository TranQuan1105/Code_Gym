package case_study.view;

import case_study.model.ICustomer;

import java.util.List;

public class CustomerView implements ICustomerView {
    @Override
    public void showCustomers(List<ICustomer> customers) {
        for (ICustomer customer : customers) {
            System.out.println(customer);
        }
    }

    @Override
    public void showCustomer(ICustomer customer) {
        System.out.println(customer);
    }

    @Override
    public void showAvailableSeats(String[][] seats) {
        System.out.println("Available Seats:");
        for (String[] row : seats) {
            for (String seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }
}