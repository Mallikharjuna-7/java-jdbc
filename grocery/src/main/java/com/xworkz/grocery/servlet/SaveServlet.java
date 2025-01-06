package com.xworkz.grocery.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.grocery.dto.GroceryDto;
import com.xworkz.grocery.repository.GroceryRepositoryImplementation;
import com.xworkz.grocery.service.GroceryService;
import com.xworkz.grocery.service.GroceryServiceImplementation;


@WebServlet("/save")
public class SaveServlet extends HttpServlet {

	public SaveServlet() {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {

		GroceryDto dto = new GroceryDto();
		dto.setGrocery_name(request.getParameter("groceryname"));
		dto.setCategory(request.getParameter("category"));
		dto.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		dto.setPrice(Integer.parseInt(request.getParameter("price")));

		GroceryRepositoryImplementation repo = new GroceryRepositoryImplementation();

		GroceryService service = new GroceryServiceImplementation(repo);

		String saveResult = service.validateAndSave(dto);

		request.setAttribute("saveResult", saveResult);

		RequestDispatcher dispatch = request.getRequestDispatcher("success.jsp");

		try {
			dispatch.forward(request, response);
		} catch (ServletException | IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
