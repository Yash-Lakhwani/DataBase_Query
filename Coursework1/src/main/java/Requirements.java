import java.sql.Blob;
import java.sql.ResultSet;
import java.util.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;


public class Requirements {
	
	public static ArrayList<productlines> productlinesarraylist = new ArrayList<productlines>();
	public static ArrayList<customer> customerarraylist = new ArrayList<customer>();
	public static ArrayList<employees> employeearraylist = new ArrayList<employees>();
	public static ArrayList<products>  productsarraylist = new ArrayList<products>();
	public static ArrayList<orderdetails> odarraylist = new ArrayList<orderdetails>();
	
	
		static BaseQuery k = new BaseQuery("root","");
		
	
	
	public static ArrayList<String> requirementA() {
		
		try {
 			ResultSet rs = k.useTable("productlines");
 			  while (rs.next()) {
				  
				   String productlinee = rs.getString("productLine");
				   String text = rs.getString("textDescription");
				   String html = rs.getString("htmlDescription");
				   Blob imagee = rs.getBlob("image");
				   
				   productlines w = new productlines(productlinee,text,html,imagee);
				   
				   productlinesarraylist.add(w);//adds the product line object fetched from database to the  arraylist
			           }
		}
 			 catch (SQLException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			
 			
 			}		
		ArrayList<String> a = new ArrayList<String>() ;//the array list with answers
		for (int i=0; i< productlinesarraylist.size();i++) {
			productlines f = productlinesarraylist.get(i);
			String z = f.getProductline();
			CharSequence seq = "Cars";
			boolean seqFound = z.contains(seq);
			if (seqFound) {
				a.add(z);
			}
		}
		return a;
	}


public static ArrayList<String> requirementB() {
	BaseQuery k = new BaseQuery("root","password12");
	try {
		ResultSet ws = k.useTable("customers");
			ResultSet zs = k.useTable("employees");
			while (ws.next()) {
				   int customerNumber = ws.getInt("customerNumber");
				   String customerName = ws.getString("customerName");
				   String contactLastName = ws.getString("contactLastName");
				   String contactFirstName = ws.getString("contactFirstName");
				   String phone = ws.getString("phone");
				   String addressLine1 = ws.getString("addressLine1");
				   String addressLine2 = ws.getString("addressLine2");
				   String city = ws.getString("city");
				   String state = ws.getString("state");
				   String postalCode = ws.getString("postalCode");
				   String country = ws.getString("country");
				   int salesRepEmployeeNumber = ws.getInt("salesRepEmployeeNumber");
				   double creditLimit = ws.getDouble("creditlimit");
				   
				   customer ze = new customer(customerNumber,customerName,contactLastName,contactFirstName,phone,addressLine1,addressLine2,city,state,postalCode,country,salesRepEmployeeNumber,creditLimit);
				   
				   customerarraylist.add(ze);
				 
				    }
			   while (zs.next()) {
				   int employeeNumber = zs.getInt("employeeNumber");
				   String lastName = zs.getString("lastName");
				   String firstName = zs.getString("firstName");
				   String extension = zs.getString("extension");
				   String email = zs.getString("email");
				   String officeCode = zs.getString("officeCode");
				   int reportsTo = zs.getInt("reportsTo");
				   String jobTitle = zs.getString("jobTitle");
				   
				   employees t = new employees ( employeeNumber,  lastName, firstName, extension, email, officeCode, reportsTo, jobTitle);
				   
				   employeearraylist.add(t);
			   }
	}
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			
			}		
	
	ArrayList<String> requirementBans = new ArrayList<String>();
	
		for (int i=0; i<customerarraylist.size();i++) {
			customer y = customerarraylist.get(i);
			int hello = y.getSalesRepEmployeeNumber();
			if (hello == 0)
					continue;
			int bye = checkEmployeeNumber(hello); // this will give the location of the sales rep in the arraylist
			employees to = employeearraylist.get(bye);
			String ans =  y.getContactFirstName() + " is represented by " + to.getFirstName() ;
			requirementBans.add(ans);
			
		}
		Collections.sort(requirementBans, String.CASE_INSENSITIVE_ORDER);
		return requirementBans;
	
	
	
	
}

public static int checkEmployeeNumber(int z) {
	int index =0;
	   for(int i =0; i< employeearraylist.size();i++){
		   employees to = employeearraylist.get(i);
		   int wo = to.getEmployeeNumber();
		   if (z == wo) {
			   index=i ;
		   }
	   }
	   return index;
	

	
}

public static ArrayList<String> requirementC() {
	BaseQuery k = new BaseQuery("root","password12");
	try {
		ResultSet ys = k.useTable("products");
			ResultSet os = k.useTable("orderdetails");
			while (ys.next()) {
			     String productCode = ys.getString("productCode") ; 
				 String productName = ys.getString("productName");
				 String productLine = ys.getString("productLine");
				 String productScale = ys.getString("productScale");
				 String productVendor = ys.getString("productVendor");
				 String productDescription = ys.getString("productDescription");
				 int quantityInStock = ys.getInt("quantityInStock");
				 double buyPrice = ys.getDouble("buyPrice");
				 double MSRP = ys.getDouble("MSRP");
				
				 
			   products yez = new products( productCode, productName, productLine, productScale, productVendor, productDescription, quantityInStock, buyPrice, MSRP);
			   productsarraylist.add(yez);
		   }
		   while (os.next()) {
			    int orderNumber = os.getInt("orderNumber");
				String productCode = os.getString("productCode");
				int quantityOrdered = os.getInt("quantityOrdered");
				double priceEach = os.getDouble("priceEach");
				int orderLineNumber = os.getInt("orderLineNumber");
				
				orderdetails otd = new orderdetails(orderNumber, productCode, quantityOrdered, priceEach, orderLineNumber);
				odarraylist.add(otd);
		   }
		
	}
	 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		}		

	ArrayList<String> requirementCans= new ArrayList<String>();
	
	
	for (int i = 0; i<productsarraylist.size();i++) {
		products z = productsarraylist.get(i);
		String productcode1= z.getProductCode();
		for (int l = 0; l< odarraylist.size();l++) {
			orderdetails yep = odarraylist .get(l);
			String productcode2 = yep.getProductCode();
			if (productcode1.equals(productcode2)) {
				double buyprice1 = z.getBuyPrice(); 
				double priceeach1 = yep.getPriceEach();
				double timestwo = buyprice1*2;
				if(priceeach1>=timestwo) {
				String answer = z.getProductName();
				requirementCans.add(answer);
			}
			else continue;
		}
	}
	
						}
				Set<String> set = new LinkedHashSet<String>();	
				set.addAll(requirementCans);
				requirementCans.clear();
				requirementCans.addAll(set);
	return requirementCans;
				}
}
