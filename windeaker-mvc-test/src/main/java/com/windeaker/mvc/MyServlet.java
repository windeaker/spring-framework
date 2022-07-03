package com.windeaker.mvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * TODO:
 *
 * @author windeaker
 * @date 2022/7/2
 */
public class MyServlet extends HttpServlet {

	final static long serialVersionUID=111111111111111L;

	@Override
	public void init() throws ServletException {
		System.out.println("my servlet initialized");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		handleLogical(req,resp);
	}

	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		handleLogical(req,resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		handleLogical(req,resp);
	}

	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		handleLogical(req,resp);
	}

	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		handleLogical(req,resp);
	}

	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		handleLogical(req,resp);
	}

	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		handleLogical(req,resp);
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("my servlet destroy");
	}

	protected void handleLogical(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		ServletContext servletContext = getServletContext();
		RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/index.jsp");
		try {
			requestDispatcher.forward(req,resp);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}


}
