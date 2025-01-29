
public class book {
	private String title;
	private author author;
	private int page;
	
	book (String title,author author ,int page){
		this.title = title;
		this.author = author;
		this.page = page;
	}
	book (String title,author author){
		this.title = title;
		this.author = author;
		this.page = 0;
		//this.(title,author,0)
		
		
	}
	book (){
		this(null,null,0);
		/*this.title = null;
		this.author = null;
		this.page = 0;*/
	}
	public String getTitle() {
		return this.title;
	}
	public author getAuthor() {
		return this.author;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPage() {
		return this.page;
		
	}
	public String toString () {
		 return getTitle () + "has"+getPage()+"write by " + getAuthor();
	}
	
}
