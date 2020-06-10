import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;

public class RequirementBexpected {
	
	public static ArrayList<String> fetch(){
	BaseQuery k = new BaseQuery("root","password12");
	ArrayList<String> answer = new ArrayList<String>();
	try {
	ResultSet rb = k.requirementB();
	while (rb.next()) {
	String yes = rb.getString("contactFirstName");
	String yes1= rb.getString("firstName");
	String done = (yes + " is represented by " + yes1) ;
	answer.add(done);
	}
	}
	catch(SQLException e) {
			
			e.printStackTrace();
		}
	
return answer;
	
}

}
