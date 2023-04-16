package oes.tastcase;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import dao.Instructions;
import model.InstructionsDao;

public class TestInsertInstruction 
{
	@Test
	public void testInsertInstruction()
	{
		boolean status =false;
		Instructions inst = new Instructions();
		inst.setInst_id(11);
		inst.setInstruction("Please Always Smile in any situation");
		
		status = InstructionsDao.insertInstruction(inst);
		
		assertTrue(status == true);
	}

	@Test
	public void testDeleteInstruction()
	{
		int result = 0;
		
		result = InstructionsDao.deleteRecord(11);
		
		assertTrue(result == 1);
	}
	
	@Test
	public void testGetAllRecords()
	{
		ArrayList<Instructions> InstructionList = null;
		
		InstructionList = InstructionsDao.getAllRecords();
		 
		 assertTrue(InstructionList != null);
	}
}
