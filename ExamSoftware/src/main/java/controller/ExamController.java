package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Questions;
import model.QuestionsDao;

@WebServlet("/Load_Exam_Page")
public class ExamController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		ArrayList<Questions>  allQuestionOnExamPage = null;
		int radioname = 0;
		
	   allQuestionOnExamPage= QuestionsDao.getAllRecords();
	   
	   HttpSession session = req.getSession();
	   
	   session.setAttribute("allQuestionList", allQuestionOnExamPage);
	   session.setAttribute("rd", radioname);
	   
		/* resp.sendRedirect("Exam.jsp"); */
	   
	   RequestDispatcher dispatcher = req.getRequestDispatcher("Exam.jsp");
		dispatcher.forward(req, resp);
		
	}

}
