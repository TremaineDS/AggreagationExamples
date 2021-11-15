



public class Aggregationn {
	String name;
	String address;
	int age;
	public Aggregationn(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}
	
	

}



  class showBooks{
	
	int bid;
	String bname;
	float price;
	int stock;
	Aggregationn auth;
	

	public showBooks (int bid, String bname, float price, int stock, Aggregationn auth) {
		this.bid = bid;
		this.bname = bname;
		this.price = price;
		this.stock = stock;
		this.auth = auth;
	}

	public void Books()
	{
		System.out.println("Author Name: "+auth.getName());
		System.out.println("Author Address is: "+auth.getAddress());
		System.out.println("Books Details is: "+bname+" "+price+" "+stock);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aggregationn authobj = new Aggregationn("Mc Grath","USA",52);
		showBooks  book = new showBooks (15116,"Java Books",200,16,authobj);
		
		book.Books();
	}

}