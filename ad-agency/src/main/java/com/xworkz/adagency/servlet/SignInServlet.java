package com.xworkz.adagency.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.adagency.repository.AdAgencyRepo;
import com.xworkz.adagency.repository.AdAgencyRepoImpl;
import com.xworkz.adagency.service.AdAgencyService;
import com.xworkz.adagency.service.AdAgencyServiceImpl;

@WebServlet("/signin")
public class SignInServlet extends HttpServlet {

	public SignInServlet() {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {

		String email = request.getParameter("email");
		int password = Integer.parseInt(request.getParameter("password"));

		AdAgencyRepo repo = new AdAgencyRepoImpl();
		AdAgencyService service = new AdAgencyServiceImpl(repo);

		boolean isAuthenticated = service.authenticate(email, password);
		
		if (isAuthenticated) {
            request.setAttribute("message", "Login Successful");
            RequestDispatcher dispatcher = request.getRequestDispatcher("signinsuccess.jsp");
            try {
				dispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } else {
            request.setAttribute("error", "Invalid Email or Password");
            RequestDispatcher dispatcher = request.getRequestDispatcher("signinfail.jsp");
            try {
				dispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

	}

}
