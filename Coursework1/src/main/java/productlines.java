import java.sql.Blob;


public class productlines {
		private String productline ; 
		private String textDescription ;
		private String htmlDescription ;
		private Blob image;
		
		public productlines(){
			super();
		}
	
		public productlines(String productline,String textDescription, String htmlDescription, Blob image){
			super();
			this.productline=productline;
			this.textDescription=textDescription;
			this.htmlDescription=htmlDescription;
			this.image=image;
		}


		public String getTextDescription() {
			return textDescription;
		}

		public String getHtmlDescription() {
			return htmlDescription;
		}

		public Blob getImage() {
			return image;
		}

		public String getProductline() {
			// TODO Auto-generated method stub
			return productline;
		}
		
	
			
}
