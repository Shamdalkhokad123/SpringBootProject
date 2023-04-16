package oes.tastcase;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import dao.Students;
import model.StudentsDao;

public class TestStudentsDAO 
{
	@Test
	public void testInsertStudents()
	{
		Students student = new Students();
		student.setSid(23);
		student.setName("Smirti");
		student.setUsername("smirti@123");
		student.setPassword("mandhana@123");
		
		boolean status = StudentsDao.insertStudent(student);
		
		assertTrue(status == true);
	}

	@Test
	public void testDeleteRecord()
	{
		int sid = 22;
		int result = StudentsDao.deleteRecord(sid);
		assertTrue(result==1);
	}
	
	@Test
	public void testGetAllRecords()
	{
		ArrayList<Students> studentList = null;
		
		 studentList = StudentsDao.getAllRecords();
		 
		 assertTrue(studentList != null);
	}
	
	@Test
	public void testUpdateRecord()
	{
		
	}
}
