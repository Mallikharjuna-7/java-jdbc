package com.xworkz.grocery.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.grocery.repository.GroceryRepository;
import com.xworkz.grocery.repository.GroceryRepositoryImplementation;
import com.xworkz.grocery.service.GroceryService;
import com.xworkz.grocery.service.GroceryServiceImplementation;


@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
		
    public DeleteServlet() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		GroceryRepositoryImplementation repo =new GroceryRepositoryImplementation();
		
		GroceryService service = new GroceryServiceImplementation(repo);
		
		int id =Integer.parseInt(request.getParameter("id"));
		
		String deleteResult = service.deleteById(id);
		
		request.setAttribute("deleteResult", deleteResult);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("view.jsp");
		
		try {
			dispatch.forward(request, response);
		} catch (ServletException | IOException e) {
			System.out.println(e.getMessage());
		}
	}


}
