package com.example.demomvc.controller;

import com.example.demomvc.service.IStudentService;
import com.example.demomvc.service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StudentServlet", value = "/student")
public class StudentServlet extends HttpServlet {
    private final IStudentService iStudentService = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null) {
            action = "";
        }
        switch (action) {
            case "show-create-form":
                showCreatForm(req, resp);
                break;
            case "show-update-form":
                showUpdateForm(req,resp);
                break;
            default:
                showStudentList(req,resp);
        }
    }

    private void showUpdateForm(HttpServletRequest req, HttpServletResponse resp) {
        try {
            req.getRequestDispatcher("update-form.jsp").forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showCreatForm(HttpServletRequest req, HttpServletResponse resp) {
        try {
            req.getRequestDispatcher("creat-form.jsp").forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showStudentList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list", iStudentService.findAll());
        req.getRequestDispatcher("student_list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null) {
            action = "";
        }
        switch (action) {
            case "add-student":
                showCreatForm(req, resp);
                break;
            case "submit-student":
                showUpdateForm(req,resp);
                break;
        }
    }
}
