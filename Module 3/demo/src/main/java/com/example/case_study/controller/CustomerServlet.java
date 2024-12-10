package com.example.case_study.controller;

import com.example.case_study.model.Customer;
import com.example.case_study.service.ICustomerService;
import com.example.case_study.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customers"})
public class CustomerServlet extends HttpServlet {
    private final ICustomerService iCustomerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Customer> customers = iCustomerService.getAllCustomers();
        request.setAttribute("customers", customers);
        request.getRequestDispatcher("/WEB-INF/views/customer-list.jsp").forward(request, response);

        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }
        switch (action) {
            case "show-customer-list":
                showCustomerList(request,response);
                break;
            case "addCustomer-form":
                addCustomer(request, response);
                break;
            default:
                request.getRequestDispatcher("/WEB-INF/customer-list.jsp").forward(request, response);
                break;
        }
    }

    private void showCustomerList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", iCustomerService.getAllCustomers());
        request.getRequestDispatcher("/WEB-INF/views/customer-list.jsp").forward(request, response);
    }

    private void addCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/addCustomer.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "addCustomer":
                addNewCustomer(request,response);
                break;
            case "updateCustomer":
//                addNewCustomer(request,response);
                break;
            case "deleteCustomer":
//                response.sendRedirect("customers?action=view");
                break;
            default:
                request.getRequestDispatcher("/WEB-INF/views/customer-list.jsp").forward(request, response);
                break;
        }
    }

    private void addNewCustomer(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(name, phone, email, address);
        iCustomerService.addCustomer(customer);
        try {
            response.sendRedirect("/library");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
