package com.example.product_discount_calculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "discount", value = "/discount")
public class Discount extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("description");
        double listPrice = Double.parseDouble(req.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(req.getParameter("discountPercent"));
        double discountAmount = listPrice * discountPercent * 0.01;
        double discountPrice = listPrice - discountAmount;

        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<html>");
            out.println("<head><title>Discount Result</title></head>");
            out.println("<body>");
            out.println("<h1>Discount Calculation Result</h1>");
            out.println("<p>Product Description: " + description + "</p>");
            out.println("<p>List Price: $" + listPrice + "</p>");
            out.println("<p>Discount Percent: " + discountPercent + "%</p>");
            out.println("<p>Discount Amount: $" + discountAmount + "</p>");
            out.println("<p>Discount Price: $" + discountPrice + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}