package addbook;

import java.util.Scanner;

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
		 String fname,lname,city,address,zip,email,phone_number;
		addbook[] ab=new addbook[10];
        int n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("how many entries :");//number of entries
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("First name :");
			fname=sc.next();
			System.out.println("Last name :");
			lname=sc.next();
			System.out.println("City name :");
			city=sc.next();
			System.out.println("address :");
			address=sc.next();
			System.out.println("zip :");
			zip=sc.next();
			System.out.println("email :");
			email=sc.next();
			System.out.println("phone number :");
			phone_number=sc.next();
			ab[i]=new addbook( fname,lname,city,address,zip,email,phone_number);
		}
		System.out.println("details::");
		for(int j=0;j<n;j++)
		{
			ab[j].display();	
		}
		
		
	}

}
