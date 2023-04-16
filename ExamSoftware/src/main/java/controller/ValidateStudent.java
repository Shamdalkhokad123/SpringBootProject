package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Instructions;
import dao.Students;
import model.InstructionsDao;
import model.StudentsDao;

/**
 * Servlet implementation class ValidateStudent
 */
@WebServlet("/ValidateStudentPage")
public class ValidateStudent extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateStudent() {
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
		
		ArrayList<Instructions> allInstructions = null;
		
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
        System.out.println("Get data from frondEnd");
		
	    Students sd = new Students();
		sd.setUsername(username);
		sd.setPassword(password);
		
	  boolean status = StudentsDao.doValidate(sd);
	    
	    
	    if(status)
	    {
	    	allInstructions =InstructionsDao.getAllRecords();
	    	//Logged in  as student do something (pending)
	    	 HttpSession studentsession = request.getSession();
			 studentsession.setAttribute("username", sd.getUsername());
		     studentsession.setAttribute("name",sd.getName() );
		     studentsession.setAttribute("instructions", allInstructions);
		     RequestDispatcher dispatcher = request.getRequestDispatcher("StudentInstructionPage");
				dispatcher.forward(request, response);
	    	
	    }
	    else
	    {
	    	String msg = "Invalid Username or Password";
	    	response.sendRedirect("StudentLogin.jsp?msg="+msg);
	    
	}

}
}
