
public class ShowSneakers {
	
			String sneaker;
			String brand;
			int item_id;
			int item_price;
			String customer_name;
			
			public ShowSneakers(String sneaker,String brand,int item_id,int item_price,String customer_name)
			
			{
				this.sneaker = sneaker;
				this.brand = brand;
				this.item_id = item_id;
				this.item_price = item_price;
				this.customer_name = customer_name;
				
			}
			public String getsneaker() {
				return sneaker;
			}
			public String getbrand() {
					return brand;
			}
			
			public int getitem_id() {
				return item_id;
			}
			
			public int getitem_price() {
				return item_price;
			}
			
			public String getcustomer_name() {
				return customer_name;
			}
			

			
			class showShoes {
				
				int sneaker_id;
				String sname;
				float sprice;
				int stock;
				ShowSneakers auth;
				
			public showShoes (int sneaker_id, String sname, float sprice, int stock, ShowSneakers auth)
			{
				this.sneaker_id = sneaker_id;
				this.sname = sname;
				this.sprice = sprice;
				this.stock = stock;
				this.auth = auth;
			}
			
			public void Shoes()
			{
				System.out.println("Sneaker Name: "+auth.getsneaker());
				System.out.println("Sneaker Brand: "+auth.getbrand());
				System.out.println("The Sneaker Details are : "+sname+" "+sprice+" "+stock);
			}
			
		
			public void main(String [] args) {
				
				ShowSneakers authobj = new ShowSneakers("Jordan", "Nike", 200,350, "For Tremaine");
				showShoes shoe = new showShoes (13312,"Jordan 11's",250,110, authobj);
				
				shoe.Shoes();
						
			}
			
	
				
				
				
			}
			
			}

