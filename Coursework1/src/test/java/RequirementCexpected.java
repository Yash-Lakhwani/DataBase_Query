import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;

public class RequirementCexpected {
	
	public static ArrayList<String> fetch(){
	BaseQuery k = new BaseQuery("root","password12");
	ArrayList<String> answer = new ArrayList<String>();
	try {
	ResultSet rb = k.requirementC();
	while (rb.next()) {
	String yes = rb.getString("productName");
	answer.add(yes);
	}
	}
	catch(SQLException e) {
			
			e.printStackTrace();
		}
	
return answer;
	
}

}

