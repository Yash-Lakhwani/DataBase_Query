import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
public  class RequirementAexpected {
	
	
	public static ArrayList<String> fetch(){
	BaseQuery k = new BaseQuery("root","password12");
	ArrayList<String> answer = new ArrayList<String>();
	try {
	ResultSet ra = k.requirementA();
	while (ra.next()) {
	String productlinee = ra.getString("productLine");
	answer.add(productlinee);
	}
	}
	catch(SQLException e) {
			
			e.printStackTrace();
		}
return answer;
	
}
}