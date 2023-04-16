package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.QuestionsDao;

/**
 * Servlet implementation class DeleteQuestionController
 */
@WebServlet("/DeleteQuestion")
public class DeleteQuestionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteQuestionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String qid = request.getParameter("qid");
		
        System.out.println(qid);
		int qid1 = Integer.parseInt(qid);
		System.out.println(qid1);
		int val = QuestionsDao.deleteRecord(qid1);
		
		if(val>0)
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("all_questions");
			dispatcher.forward(request, response);
		}
		else
		{
			System.out.println("Simple App");
		}
	}

}
