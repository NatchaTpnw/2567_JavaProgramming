
public class author {
private String name;
private String email;

	author (){
		this(null,null);
	}

	author (String name,String email){
		this.name = name ;
		this.email = email;
	}
	
	public String getName() {
		return this.name;
		
	}
	public String getEmail() {
		return this.email;
	}
	public String toString() {
	
		return getName ()+ " ("+ getEmail () +")";
	}
}
