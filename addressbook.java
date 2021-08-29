package addressbook;
<<<<<<< HEAD

=======
>>>>>>> multiaddress
import java.util.ArrayList;
import java.util.Scanner;

/*
 * this class will allow to add ,edit,delete,display contacts in a address book
 */
public class addressbook {
<<<<<<< HEAD
	public static int n = 0;
	Scanner sc = new Scanner(System.in);

	public ArrayList<addressbook> contact = new ArrayList<>();
	public String fname, lname, city, address, zip, email, phone_number;

	/*
	 * this is a constructor to initialize parameters
	 */
	public addressbook(String fname, String lname, String city, String address, String zip, String email,
			String phone_number) {
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		this.address = address;
		this.zip = zip;
		this.email = email;
		this.phone_number = phone_number;
	}

	public addressbook() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * this method is used to insert information into address book info like first
	 * ,last name,email,phone number etc can be inserted into address book
	 */
	public void insertContact() {
		System.out.println("Add the details");

		System.out.println("First name :");
		fname = sc.next();
		System.out.println("Last name :");
		lname = sc.next();
		System.out.println("City name :");
		city = sc.next();
		System.out.println("address :");
		address = sc.next();
		System.out.println("zip :");
		zip = sc.next();
		System.out.println("email :");
		email = sc.next();
		System.out.println("phone number :");
		phone_number = sc.next();
		contact.add(new addressbook(fname, lname, city, address, zip, email, phone_number));

	}

	/*
	 * this method will allow user to edit already present contact details it will
	 * ask user to enter the name of the person who's contact details is to be
	 * edited if the name is present then it will allow user to edit details
	 * otherwise it will display that name is absent in addressbook
	 */
	public void editContact() {
		System.out.println("enter the name of person you want to edit");
		String name = sc.next();
		for (int i = 0; i < contact.size(); i++)// loop to enter n values
		{
			addressbook obj = contact.get(i);
			if (obj.fname.equals(name)) {
				System.out.println("First name :");
				obj.fname = sc.next();
				System.out.println("Last name :");
				obj.lname = sc.next();
				System.out.println("City name :");
				obj.city = sc.next();
				System.out.println("address :");
				obj.address = sc.next();
				System.out.println("zip :");
				obj.zip = sc.next();
				System.out.println("email :");
				obj.email = sc.next();
				System.out.println("phone number :");
				obj.phone_number = sc.next();

			} else {
				System.out.println("name not found");
			}
		}
	}

	/*
	 * this method will display the contact details in addressbook
	 */
	public void displayContact() {
		if (contact.size() == 0) {
			System.out.println("empty adddressbook!!!");
		} else {
			System.out.println("Contents of addressbook:");
			for (int j = 0; j < contact.size(); j++) {
				addressbook obj = contact.get(j);
				System.out.println("first name is :" + obj.fname);
				System.out.println("last name is :" + obj.lname);
				System.out.println("city name is :" + obj.city);
				System.out.println("address is :" + obj.address);
				System.out.println("zip is :" + obj.zip);
				System.out.println("email is :" + obj.email);
				System.out.println("phone number  is :" + obj.phone_number);
			}

		}

	}

	/*
	 * this method will delete the specified contact from addressbook users enters
	 * the name of person who's contact is to be deleted array list has method
	 * called remove to remove entries
	 */
	public void deleteContact() {
		System.out.println("Enter the person whose contact to be deleted");
		String name11 = sc.next();

		for (int j = 0; j < contact.size(); j++) {
			addressbook object = contact.get(j);
			if (object.fname.equals(name11)) {

				contact.remove(object);

=======
	
	public static int n=0;
	static Scanner sc=new Scanner(System.in);
	
	public static ArrayList<addressbook>contact=new ArrayList<>();
	
	public String  fname,lname,city,address,zip,email,phone_number;
	
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
	
	
	public addressbook() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	
	

	
	
		public void addcontact() {
			addressbook obj=new addressbook();
			System.out.println("Add the details");
		
			System.out.println("First name1 :");
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
			contact.add(new addressbook(fname,lname,city,address,zip,email,phone_number));
		}
		
		
			public void editcontact() {
		  System.out.println("enter the name of person you want to edit");
		      String name=sc.next();
		      
		      for(int i=0;i<contact.size();i++)//loop to enter n values
				{
		    	  addressbook obj=contact.get(i);
		    	  if(obj.fname.equals(name)) 
		    	  {
					System.out.println("First name :");
					obj.fname=sc.next();
					System.out.println("Last name :");
					obj.lname=sc.next();
					System.out.println("City name :");
					obj.city=sc.next();
					System.out.println("address :");
					obj.address=sc.next();
					System.out.println("zip :");
					obj.zip=sc.next();
					System.out.println("email :");
					obj.email=sc.next();
					System.out.println("phone number :");
					obj.phone_number=sc.next();
					
		    	  }
		    	  else {
		    		  System.out.println("name not found");
		    	  }	
				}
			}
			
			
		     public void displaycontact()
		     {
		       if(n==0)
		       {
			     System.out.println("no entries");
		       }
			for(int j=0;j<contact.size();j++)
				{
			    	addressbook obj=contact.get(j);
					System.out.println("display contents");
					System.out.println("Person "+j);
					System.out.println("first name is :"+obj.fname);
					System.out.println("last name is :"+obj.lname);
					System.out.println("city name is :"+obj.city);
					System.out.println("address is :"+obj.address);
					System.out.println("zip is :"+obj.zip);
					System.out.println("email is :"+obj.email);
					System.out.println("phone number  is :"+obj.phone_number);
				}
		     }

		public void deletecontact() {
			System.out.println("enter the name to be deleted");
			String dname=sc.next();
			for(int i=0;i<contact.size();i++)
			{
				addressbook obj=contact.get(i);
			if(obj.fname.equals(dname))
			{
				contact.remove(obj);
				System.out.println("deleted");
				
			}
			else {
				System.out.println("not found");
			}
>>>>>>> multiaddress
			}
		}
		

		

	}

