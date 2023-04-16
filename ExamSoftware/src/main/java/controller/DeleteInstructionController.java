package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.InstructionsDao;

/**
 * Servlet implementation class DeleteInstructionController
 */

@WebServlet("/DeleteInstruction")
public class DeleteInstructionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteInstructionController() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int inst_id = Integer.parseInt(request.getParameter("inst_id"));
		String inst_id = request.getParameter("inst_id");
		
		int intst_id = Integer.parseInt(inst_id);
		
		int val = InstructionsDao.deleteRecord(intst_id);
		
		if(val>0)
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("viewInstructions");
			dispatcher.forward(request, response);
		}
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
