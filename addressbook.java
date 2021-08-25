package addressbook;
import java.util.ArrayList;
import java.util.Scanner;
public class addressbook {
	public static int n=0;
	
	public static ArrayList<addressbook>contact=new ArrayList<>();
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
	public static void delete(addressbook object)
	{
		contact.remove(object);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname,lname,city,address ,zip ,email ,phone_number;
		System.out.println("welcome to address book");//welcome message
		
		
		Scanner sc=new Scanner(System.in);
		
		
		
		
		int choice,c=0;
		while(c!=1) {
		System.out.println("enter the choice 1.Add 2.edit 3.Display 4.delete");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Add the details");
		
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
		    
		    break;
		case 2:System.out.println("enter the name of person you want to edit");
		      String name=sc.next();
		      
		      for(int i=0;i<contact.size();i++)//loop to enter n values
				{
		    	  addressbook obj=contact.get(i);
		    	  if(obj.fname.equals(name)) 
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
					obj.edit(fname,lname,city,address ,zip ,email ,phone_number);
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
			for(int j=0;j<contact.size();j++)
				{
			    	addressbook obj=contact.get(j);
					System.out.println("display contents");
					System.out.println("Person "+j);
					obj.display();
				}
		          break;
		case 4:
			System.out.println("enter the name to be deleted");
			String dname=sc.next();
			for(int i=0;i<contact.size();i++)
			{
				addressbook obj=contact.get(i);
			if(obj.fname.equals(dname))
			{
				delete(obj);
				
			}
			else {
				System.out.println("not found");
			}
			}
			break;
		default:c=1;
		         break;
		}

		}

	}

}