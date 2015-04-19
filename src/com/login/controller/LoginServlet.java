package com.login.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.jni.User;

import com.login.dao.UserDao;
import com.login.entity.Users;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// private UserDao userDao;
	private String userName;
	private String passwd;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// IF DAO layer not setup correct. Continue using init param FOR
		// Testing!.
		// userDao = new UserDao();
		userName = config.getServletContext().getInitParameter("username");
		passwd = config.getServletContext().getInitParameter("passwd");
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String loginName = request.getParameter("uname");
		String loginPasswd = request.getParameter("pwd");

		// User DAO layer if it's OKY.
//		Users user = userDao.login(loginName, loginPasswd);
//		if (user != null) {
//			HttpSession session = request.getSession(true);
//			session.setAttribute("user", user);
//			response.sendRedirect("welcome.jsp");
//		} else {
//			response.sendRedirect("error.jsp");
//		}

		// Use initparam if database layer not ready for TEST.
		if (userName.equals(loginName) && passwd.equals(loginPasswd)) {
			HttpSession session = request.getSession(true);
			session.setAttribute("user", new Users("Khaled", "Lela"));
			response.sendRedirect("welcome.jsp");
		} else
			response.sendRedirect("error.jsp");
	}
}
