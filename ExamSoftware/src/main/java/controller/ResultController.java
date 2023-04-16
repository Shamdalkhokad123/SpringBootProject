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

/**
 * Servlet implementation class ResultController
 */
@WebServlet("/final_result_page")
public class ResultController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResultController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		String[] dbans = new String[100];
		ArrayList<Questions> allQuestions = QuestionsDao.getAllRecords();
		int i = 0;
		int size = allQuestions.size();
		for(Questions e : allQuestions)
		{   
			dbans[i] = e.getAnswer();
			  i++;
		}
		String[] userans = new String[100];
		for(int j = 0 ; j < size ; j++)
		{
			userans[j] = request.getParameter(Integer.toString(j));
		}
		int correctanswer=0;
		int unattempted = 0;
		int wronganswer=0;
		/*
		 * for(int k = 0 ; k< size;k++) { if(userans[k].equalsIgnoreCase(dbans[k])) {
		 * correctanswer++; } else if(userans[k].equals("e")) { unattempted++; } else {
		 * wronganswer++; } }
		 */
		session.setAttribute("totalquestions", size);
		session.setAttribute("correctanswer", correctanswer);
		session.setAttribute("unattempted", unattempted);
		session.setAttribute("wronganswer", wronganswer);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Result.jsp");
		
		dispatcher.forward(request, response);
		
		
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
