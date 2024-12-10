package com.example.casestudy.controller;


import com.example.casestudy.model.Customer;
import com.example.casestudy.sevice.CustomerService.CustomerService;
import com.example.casestudy.sevice.CustomerService.ICustomerService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LibraryServlet", value = "/customer")
public class LibraryServlet extends HttpServlet {
    private final ICustomerService iCustomerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "show-create-form":
                showCreateForm(req, resp);
                break;
            case "show-update-form":
                showUpdateForm(req, resp);
                break;
            case "show-delete-customer":
                showDeleteForm(req, resp);
                break;
            default:
                showCustomerList(req, resp);
        }
    }

    private void showDeleteForm(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
    }

    private void showUpdateForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("update-form.jsp").forward(req, resp);
    }

    private void showCreateForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("create-form.jsp").forward(req, resp);
    }

    private void showCustomerList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list", iCustomerService.findAll());
        req.getRequestDispatcher("customer-list.jsp").forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                addNewCustomer(req, resp);
                break;
            case "update":
//                updateCustomer(req, resp);
                break;
            case "delete":
                deleteCustomer(req, resp);
                break;
            default:
                showCustomerList(req, resp);
        }
    }

    private void deleteCustomer(HttpServletRequest req, HttpServletResponse resp) {
        
    }

    private void addNewCustomer(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        Customer customer = new Customer(name, phone, email, address);
        iCustomerService.save(customer);
        try {
            resp.sendRedirect("/customer");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}