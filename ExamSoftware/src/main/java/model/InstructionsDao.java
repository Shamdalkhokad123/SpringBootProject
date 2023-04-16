package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.Instructions;
import dao.Provider;

public class InstructionsDao {

	public static boolean insertInstruction(Instructions ist) {
		// TODO Auto-generated method stub
		boolean status = false;
		try
		{
		
		Connection con = Provider.getOracleConnection();
		String sql = "insert into instructiontable values(?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, ist.getInst_id());
		pst.setString(2,ist.getInstruction());

		int val = pst.executeUpdate();
		if(val > 0)
		{
			status = true;
		}
		else
		{
			status = false;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}
	public static ArrayList<Instructions> getAllRecords()
	{
        ArrayList<Instructions>  samp =new ArrayList<Instructions>();
		try
		{
			
		   samp.clear();
		   Connection con = Provider.getOracleConnection();
		   String sql = "select * from instructiontable";
		   PreparedStatement pst = con.prepareStatement(sql);
		   
		   ResultSet rs = pst.executeQuery(sql);
		   while(rs.next())
		   {
			  Instructions i = new Instructions();
			  i.setInst_id(rs.getInt(1));
			   i.setInstruction(rs.getString(2));
			   samp.add(i);
			 
			  
			   
		   }
		  

		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		return samp;
	}
	public static int deleteRecord(int inst_id) {
		// TODO Auto-generated method stub
	int val = 0;
		try
		{
		
		Connection con = Provider.getOracleConnection();
		String sql = "delete from instructiontable where inst_id=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1,inst_id);

	    val = pst.executeUpdate();
	
	
	    }
		catch(Exception e)
		{
			val = -1;
		}
		return val;
	}
	public static int doUpdateNowRecord(String instaoriginal,String instamodified)
	{
		int status = 0;
		try
		{
		
		Connection con = Provider.getOracleConnection();
		String sql = "update instructiontable set instruction=? where instruction=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1,instamodified);
		pst.setString(2, instaoriginal);
	
		int val = pst.executeUpdate();
		if(val > 0)
		{
			status = 1;
		}
		else
		{
			status = -1;
		}
		}
		catch(Exception f)
		{
			status = 2;
			f.printStackTrace();
		}
		
	    
		return status;
	}
		
}
