package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ControllInterface {

	public void requestPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, Exception; 
	
}
