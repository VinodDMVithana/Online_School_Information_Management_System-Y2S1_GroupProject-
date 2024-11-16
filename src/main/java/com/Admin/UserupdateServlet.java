package com.Admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserupdateServlet")
public class UserupdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("userid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String role = request.getParameter("role");

		boolean isTrue = AdminDButil.updateuser(id, name, email, phone, username, password, role);

		if (isTrue) {
			request.setAttribute("message", "Data updated successfully!");
			request.setAttribute("alertType", "success");
		} else {
			request.setAttribute("message", "Data update failed. Please try again.");
			request.setAttribute("alertType", "error");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("/Dilki/results.jsp");
		dispatcher.forward(request, response);
	}
}