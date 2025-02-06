package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/userData")  // Maps to the URL pattern "/userData"
public class UserDataServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = new ArrayList<>();
        users.add(new User("john_doe", "john@example.com"));
        users.add(new User("jane_doe", "jane@example.com"));

        request.setAttribute("userList", users);
        request.getRequestDispatcher("userData.jsp").forward(request, response);
    }
}