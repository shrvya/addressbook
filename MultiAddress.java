package addressbook;

import java.util.Hashtable;
import java.util.Scanner;

public class MultiAddress {
	static int choice;
	static Scanner sc=new Scanner(System.in);
	public static void choose(int choice,addressbook obj)
	{
		switch(choice)
		{
		case 1:obj.addcontact();
		      break;
		case 2:obj.editcontact();
		      break;
		case 3:obj.displaycontact();
		       break;
		case 4:obj.deletecontact();
		break;
		
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addressbook obj=new addressbook();
		Hashtable<String,addressbook> multiaddress= new Hashtable<String,addressbook>();
		String k="addressbook1";
		multiaddress.put(k,obj);
		String addname=" ";
		int counter=0;
		while(counter!=1)
		{
		System.out.println("enter the choice 1.Add 2.edit 3.Display 4.delete 5.add addressbook 6.exit");
		choice=sc.nextInt();
		if(choice==5)
		{
		      
		      System.out.println("Enetr addressbook name");
		      addressbook obj1=new addressbook();
		      addname=sc.next();
		      multiaddress.put(addname,obj1);
		}
		else if(choice==6)
		{
			counter=1;
			System.out.println("exited");
		      
		      
		}
		else {
			System.out.println("Enter addressbook name1::");
			addname=sc.next();
			choose(choice, multiaddress.get(addname));
		}
		
		}
		

	}

}
