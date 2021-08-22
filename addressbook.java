package addressbook;
import java.util.Scanner;
public class addressbook {
	public static int n=0;
	private String  fname,lname,city,address,zip,email,phone_number;
	public addressbook( String fname, String lname, String city, String address, String zip, String email, String phone_number)
	{
		this.fname=fname;
		this.lname=lname;
		this.city=city;
		this.address=address;
		this.zip=zip;
		this.email=email;
		this.phone_number=phone_number;	
	}
	public void  edit( String fname, String lname, String city, String address, String zip, String email, String phone_number)
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
		
		
		Scanner sc=new Scanner(System.in);
		
		
		
		addressbook[] ad1=new addressbook[10];
		int choice,c=0;
		while(c!=1) {
		System.out.println("enter the choice 1.Add 2.edit 3.Display");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Add the details");
		
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
			ad1[n]=new addressbook(fname,lname,city,address,zip,email,phone_number);
		    n++;
		    break;
		case 2:System.out.println("enter the name of person you want to edit");
		      String name=sc.next();
		      for(int i=0;i<n;i++)//loop to enter n values
				{
		    	  if(ad1[i].fname.equals(name)) {
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
					ad1[i].edit(fname,lname,city,address ,zip ,email ,phone_number);
		    	  }
		    	  else {
		    		  System.out.println("name not found");
		    	  }	
				}
		      break;
		case 3: if(n==0)
		{
			System.out.println("no entries");
		}
			for(int j=0;j<n;j++)
				{
					System.out.println("display contents");
					ad1[j].display();
				}
		          break;
		default:c=1;
		        		  break;
		}

		}

	}

}