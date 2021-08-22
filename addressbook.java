package addressbook;

import java.util.Scanner;

public class addressbook {
	private String  fname,lname,city,address,zip,email,phone_number;
	public void  addressbook( String fname, String lname, String city, String address, String zip, String email, String phone_number)
	{
		this.fname=fname;
		this.lname=lname;
		this.city=city;
		this.address=address;
		this.zip=zip;
		this.email=email;
		this.phone_number=phone_number;	
	}
	public void display()
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
		String fname,lname,city,address ,zip ,email ,phone_number;
		System.out.println("welcome to address book");//welcome message
		int n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("how many entries :");//number of entries
		n=sc.nextInt();
		addressbook ad=new addressbook();
		for(int i=0;i<n;i++)//loop to enter n values
		{
			System.out.println("First name :");
			ad.fname=sc.next();
			System.out.println("Last name :");
			ad.lname=sc.next();
			System.out.println("City name :");
			ad.city=sc.next();
			System.out.println("address :");
			ad.address=sc.next();
			System.out.println("zip :");
			ad.zip=sc.next();
			System.out.println("email :");
			ad.email=sc.next();
			System.out.println("phone number :");
			ad.phone_number=sc.next();
			
			
		}
		
		for(int j=0;j<n;j++)
		{
			System.out.println("display contents");
			ad.display();
		}

	}

}
