package oes.tastcase;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import dao.Questions;
import model.QuestionsDao;

public class TestQuestionsDAO
{
	@Test
	public void testInsertQuestions()
	{
		Questions question = new Questions();
		question.setQid(15);
		question.setQuestion("Where Am I staying now?");
		question.setA("Shaikhpet");
		question.setB("Ameerpet");
		question.setC("Begumpet");
		question.setD("Secunderabad");
		question.setAnswer("Shaikhpet");
		
		boolean res = QuestionsDao.insertQuestion(question);
		
		assertTrue(res == true);
	}

	@Test
	public void testDeleteRecord()
	{
		int qid = 15;
		
		int res = QuestionsDao.deleteRecord(qid);
		assertTrue(res==1);
		
	}
	
	@Test
	public void testGetAllRecords()
	{
		ArrayList<Questions> questionList = null;
		
		 questionList = QuestionsDao.getAllRecords();
		 
		 assertTrue(questionList != null);
	}
}
