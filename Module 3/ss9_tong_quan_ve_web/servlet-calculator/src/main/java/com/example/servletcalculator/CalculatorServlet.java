package com.example.servletcalculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "calculate", value = "/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float firstOperand = Integer.parseInt(req.getParameter("first-operand"));
        float secondOperand = Integer.parseInt(req.getParameter("second-operand"));
        String operator = req.getParameter("operator");
        double result;
        switch(operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                if (firstOperand >= secondOperand){
                    result = firstOperand - secondOperand;
                }else{
                    result = secondOperand - firstOperand;
                }
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                if (secondOperand != 0){
                    result = firstOperand / secondOperand;
                }else {
                    throw new RuntimeException("Only divide to number difference 0");
                }
                break;
            default:
                throw new RuntimeException("Input not accept");
        }

        req.setAttribute("result", result);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
}