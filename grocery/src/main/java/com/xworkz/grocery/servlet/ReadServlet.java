package com.xworkz.grocery.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.grocery.dto.GroceryDto;
import com.xworkz.grocery.repository.GroceryRepository;
import com.xworkz.grocery.repository.GroceryRepositoryImplementation;
import com.xworkz.grocery.service.GroceryService;
import com.xworkz.grocery.service.GroceryServiceImplementation;

import lombok.AllArgsConstructor;

@WebServlet("/view")
public class ReadServlet extends HttpServlet {

	public ReadServlet() {

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {

		GroceryRepositoryImplementation repo = new GroceryRepositoryImplementation();

		GroceryService service = new GroceryServiceImplementation(repo);

		List<GroceryDto> listOfGrocery = service.read();

		request.setAttribute("listOfGrocery", listOfGrocery);

		RequestDispatcher dispatch = request.getRequestDispatcher("view.jsp");

		try {
			dispatch.forward(request, response);
		} catch (ServletException | IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
