package addbook;

import java.util.Scanner;

public class addbook {
	public static int n=0;
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
	public static void delete(int v,addbook[] ab)//delete the contact 
	{
		int i;
		ab[v]=null;
		for( i=v;i<n;i++)
		{
			ab[i]=ab[i+1];
		}
		
	}
	
	public void edit(String fname, String lname, String city, String address, String zip, String email, String phone_number)//method to edit
	{
		this.fname=fname;
		this.lname=lname;
		this.city=city;
		this.address=address;
		this.zip=zip;
		this.email=email;
		this.phone_number=phone_number;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to address book"); 
		 String fname,lname,city,address,zip,email,phone_number;
		addbook[] ab=new addbook[10];
       int c=0,choice;
		
		Scanner sc=new Scanner(System.in);
		while(c!=1)
		{
			
			System.out.println("enter the choice 1.Add 2.edit 3.Display ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Add the details");//choice=1,then details are entered
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
				ab[n]=new addbook( fname,lname,city,address,zip,email,phone_number);
			    n++;
			    break;
			case 2:System.out.println("enter the name of person you want to edit");
		           String ename=sc.next();
		      for(int i=0;i<n;i++)//loop to enter values
				{
		    	  if(ab[i].fname.equals(ename))//checks if name is present 
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
					ab[i].edit(fname,lname,city,address ,zip ,email ,phone_number);
		    	  }
		    	  else {
		    		  System.out.println("Name not found");
		    	  }
				}
		    	  break;
		
		    	  case 3:System.out.println("details::");
		    	         for(int j=0;j<n;j++)
		  		         {
		  			       ab[j].display();	
		  		          }
		    	          break;
		    	  case 4:System.out.println("enter the name to be deleted");
		    	         String dname=sc.next();
		    	         for(int i=0;i<n;i++) {
		    	         if(ab[i].fname.equals(dname))//checks if name is present 
				    	  {
		    	        	 int val=i;
		    	        	 delete(val,ab);
		    	        	 n--;
				    	  }
		    	         }
		    	         break;
		    	         
		    	  default :
		    		  c=1;
		    		  break;
		}
	}
	}
}
