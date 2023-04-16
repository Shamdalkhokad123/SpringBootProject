package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Students;
import model.StudentsDao;

/**
 * Servlet implementation class StudentInsert
 */
@WebServlet("/add_student")
public class StudentInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		String name = request.getParameter("name");
		
		Students st = new Students();
		st.setName(name);
		st.setPassword(password);
		st.setUsername(username);
		
		//HttpSession session = request.getSession();
		
		boolean status = StudentsDao.insertStudent(st);
		if(status)
		{
			//String msg3 = "student not added";
			request.setAttribute("msg4", "Student added");
	    	response.sendRedirect("AddStudentPage");
		}
		else
		{
			//String msg4 = "student not added";
			request.setAttribute("msg3","student not added" );
	    	response.sendRedirect("AddStudentPage");
		}
		
	}

}
