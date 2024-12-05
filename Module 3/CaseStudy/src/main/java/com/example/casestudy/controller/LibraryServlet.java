package com.example.casestudy.controller;


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
        if(action == null) {
            action = "";
        }
        switch (action) {
            case "show-borrow-form":
                break;
            case "show-return-form":
                break;
            default:
                showCustomerList(req, resp);
        }
    }

    private void showCustomerList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list", iCustomerService.findAll());
        req.getRequestDispatcher("customer-list.jsp").forward(req,resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}