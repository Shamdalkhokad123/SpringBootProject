package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Admins;
import model.AdminsDao;

/**
 * Servlet implementation class ValidateAdmin
 */
@WebServlet("/ValidateAdminLogin")
public class ValidateAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		

		
		Admins ad = new Admins();
		ad.setUsername(username);
		ad.setPassword(password);
		
	    boolean status = AdminsDao.doValidate(ad);
	    
	    if(status)
	    {
	    
	    	
	    	 HttpSession session = request.getSession();
			 session.setAttribute("username", ad.getUsername());
			//response.sendRedirect("AdminPanel.jsp");
			
			  RequestDispatcher dispatcher =
			  request.getRequestDispatcher("AdminPanelPage"); dispatcher.forward(request,
			  response);
			 
	    }
	    else
	    {
	    	String msg2 = "Invalid Username or Password";
	    	request.setAttribute("msg2", msg2);
	    	response.sendRedirect("AdminLogin.jsp?msg2="+msg2);
	    }
		
		
	}

}
