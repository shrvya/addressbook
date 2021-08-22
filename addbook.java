package addbook;

public class addbook {
	
	private String  fname,lname,city,address,zip,email,phone_number;
	public addbook( String fname, String lname, String city, String address, String zip, String email, String phone_number)//constructor
	{
		this.fname=fname;
		this.lname=lname;
		this.city=city;
		this.address=address;
		this.zip=zip;
		this.email=email;
		this.phone_number=phone_number;	
	}
	
	public void display()//display enterd details
	{
		System.out.println("first name is :"+fname);
		System.out.println("last name is :"+lname);
		System.out.println("city name is :"+city);
		System.out.println("address is :"+address);
		System.out.println("zip is :"+zip);
		System.out.println("email is :"+email);
		System.out.println("phone number  is :"+phone_number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to address book"); 
		addbook ab=new addbook("shri","shetty","udupi","karnataka","ziip","shri@","978465");
		ab.display();
	}

}
