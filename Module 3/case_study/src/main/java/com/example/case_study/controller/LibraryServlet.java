package com.example.case_study.controller;

import com.example.case_study.model.Customer;
import com.example.case_study.service.BookService;
import com.example.case_study.service.CustomerService;
import com.example.case_study.service.IBookService;
import com.example.case_study.service.ICustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LibraryServlet", urlPatterns = {"/library"})
public class LibraryServlet extends HttpServlet {
    private final ICustomerService iCustomerService = new CustomerService();
    private final IBookService iBookService = new BookService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }
        switch (action) {
            case "show-customer-list":
                showCustomerList(request,response);
                break;
            case "show-books-list":
                showBooksList(request,response);
                break;
            case "orders":
                response.sendRedirect("orders");
                break;
            case "addCustomer-form":
                addCustomer(request, response);
                break;
            default:
                request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
                break;
        }
    }

    private void showBooksList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", iBookService.getAllBooks());
        request.getRequestDispatcher("/WEB-INF/views/book-list.jsp").forward(request, response);
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
            case "updateCustomer":
//                addNewCustomer(request,response);
                break;
            case "deleteCustomer":
                response.sendRedirect("customers?action=view");
                break;
            case "borrowBook":
                response.sendRedirect("orders?action=view");
                break;
            case "returnBook":
                response.sendRedirect("orders?action=view");
                break;
            default:
                request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
                break;
        }
    }

}