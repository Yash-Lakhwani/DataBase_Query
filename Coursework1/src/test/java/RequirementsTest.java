//import org.junit.Assert.*;
//
//import java.sql.ResultSet;
//import java.util.Collection;
//import java.sql.SQLException;
import java.util.ArrayList;


import org.junit.Assert;
import org.junit.Test;


public class RequirementsTest {


	@Test
	public void test1() {
		
		ArrayList<String> actual = Requirements.requirementA();
		ArrayList<String> expected =RequirementAexpected.fetch();
		
	Assert.assertTrue("Doesn't match the correct answer",expected.containsAll(actual));
	}
	
	
	@Test
	public void test2() {
		
		ArrayList<String> actual1 = Requirements.requirementB();
		ArrayList<String> expected1 = RequirementBexpected.fetch();		
		
	Assert.assertTrue("Doesn't match the correctanswer",expected1.containsAll(actual1));	
		
	}
	
	
	@Test
	public void test3() {
		
		ArrayList<String> actual2 = Requirements.requirementC();
		ArrayList<String> expected2 = RequirementCexpected.fetch();
		
	Assert.assertTrue(actual2.containsAll(expected2));
	
	}
	
		
	
}

	
		
	


