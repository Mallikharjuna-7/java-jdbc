package com.xworkz.adagency.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.adagency.dto.AdAgencyDto;
import com.xworkz.adagency.repository.AdAgencyRepo;
import com.xworkz.adagency.repository.AdAgencyRepoImpl;
import com.xworkz.adagency.service.AdAgencyService;
import com.xworkz.adagency.service.AdAgencyServiceImpl;

@WebServlet("/view")
public class ReadServlet extends HttpServlet {

	public ReadServlet() {

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {

		AdAgencyRepo repo = new AdAgencyRepoImpl();
		AdAgencyService service = new AdAgencyServiceImpl(repo);

		List<AdAgencyDto> listOfDto = service.findAll();

		request.setAttribute("listOfDto", listOfDto);

		RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");

		RequestDispatcher dispatchersignin = request.getRequestDispatcher("signin.jsp");
		try {
			dispatcher.forward(request, response);
			dispatchersignin.forward(request, response);
		} catch (ServletException | IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
