package addressbook;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * this class will allow to add ,edit,delete,display contacts in a address book
 * it has variables fname, lname, city, address, zip, email, phone_number
 * fname holds first name,lname holds last name
 * city,address holds address details,email holds email 
 * password holds password
 */
public class addressbook {

	public static int n = 0;
	Scanner sc = new Scanner(System.in);

	public ArrayList<addressbook> contact = new ArrayList<>();
	public String fname, lname, city, address, zip, email, phone_number;
	Dictionary<String, String> dict = new Hashtable();

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
	 * this method will aloow user to find people living in particular city it will
	 * display name of people living in particular city
	 */
	public void findPerson() {
		System.out.println("Enter the city");
		String fcity = sc.next();
		for (int i = 0; i < contact.size(); i++) {
			addressbook value = contact.get(i);
			System.out.println("People in the city are!");
			if (value.city.equals(fcity)) {
				System.out.println(value.fname + " " + value.lname);
			}
		}
	}
	  public void writeFile(String file) {
	        try {
	            FileWriter writer = new FileWriter(file+".txt");
	            for (int j=0;j<contact.size();j++)
	            {
	                addressbook object=contact.get(j);
	                writer.write("\nfirstname:"+object.fname+"\nlastname:"+object.lname+
	                        "\naddress:"+object.address+"\ncity:"+object.city
	                        +"\nzip:"+object.zip+"\nphone number:"+object.phone_number+"\nemail:"
	                        +object.email+"\n");
	            }
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }    
	    }
	    
	    public void readFile(String file) throws IOException
	    {
	        FileReader fr =new FileReader(file+".txt");
	              int i;
	              while ((i=fr.read()) != -1)
	                System.out.print((char) i);
	    }
	    

	/*
	 * this is a method to group people by city
	 */
	public void dictionary() {
		int count = 0;
		Map<String, List<String>> pcity = new HashMap<>();
		for (int j = 0; j < contact.size(); j++) {
			addressbook info = contact.get(j);
			if (pcity.containsKey(info.city)) {
				List<String> temp = pcity.get(info.city);
				temp.add(info.fname);
				pcity.put(info.city, temp);
			} else {
				List<String> temp = new ArrayList<>();
				temp.add(info.fname);
				pcity.put(info.city, temp);
			}
		}
		for (Map.Entry m : pcity.entrySet()) {

			System.out.println(m.getKey() + " : " + m.getValue());
			System.out.println("people in city" + m.getKey() + "is " + ((List<String>) m.getValue()).size());
		}

	}

	/*
	 * this is a method to check for duplicate name it will compare entered name
	 * with name in the address book
	 */
	public boolean duplicate(String name) {
		for (int i = 0; i < contact.size(); i++) {
			addressbook value = contact.get(i);

			if (value.fname.equals(name)) {
				System.out.println("Firstname already exists!!!!");
				return true;
			}
		}
		return false;
	}

	/*
	 * this method is used to insert information into address book info like first
	 * ,last name,email,phone number etc can be inserted into address book
	 */
	public void insertContact() {
		System.out.println("Add the details");

		System.out.println("First name :");
		fname = sc.next();
		if (duplicate(fname) == false) {
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
			dict.put(city, fname);
		}
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
			}
		}
	}

	/*
	 * this is a method to sort name of person using streams
	 */
	public void sortname() {
		Map<String, addressbook> map = new HashMap<String, addressbook>();
		for (int index = 0; index < contact.size(); index++) {
			addressbook ad = contact.get(index);
			map.put(ad.fname, ad);
		}
		Map<String, addressbook> sort = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		for (Map.Entry<String, addressbook> entry : sort.entrySet()) {
			System.out.println("First Name:" + entry.getValue().fname);
			System.out.println("Last Name:" + entry.getValue().lname);
			System.out.println("Address:" + entry.getValue().address);
			System.out.println("City:" + entry.getValue().city);

			System.out.println("Zip:" + entry.getValue().zip);
			System.out.println("Phone number:" + entry.getValue().phone_number);
			System.out.println("E-mail:" + entry.getValue().email);

		}
	}
/*
 * this method is used to sort by city or zip depending on user option
 */
	public void sortcityzip(int option) {
		Map<String, List<addressbook>> map = new HashMap<>();
		if (option == 1) {
			for (int j = 0; j < contact.size(); j++) {
				addressbook object = contact.get(j);
				if (map.containsKey(object.city)) {
					List<addressbook> temp = map.get(object.city);
					temp.add(object);
					map.put(object.city, temp);
				} else {
					List<addressbook> temp = new ArrayList<>();
					temp.add(object);
					map.put(object.city, temp);
				}
			}
		} else if (option == 2) {
			for (int j = 0; j < contact.size(); j++) {
				addressbook object = contact.get(j);
				if (map.containsKey(object.zip)) {
					List<addressbook> temp = map.get(object.zip);
					temp.add(object);
					map.put(object.zip, temp);
				} else {
					List<addressbook> temp = new ArrayList<>();
					temp.add(object);
					map.put(object.zip, temp);
				}
			}
		} else {
			System.out.println("enter right option");
		}
		Map<String, List<addressbook>> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
		for (Map.Entry<String, List<addressbook>> entry : sortedMap.entrySet()) {
			for (addressbook a : entry.getValue()) {
				System.out.println("First Name:" + a.fname);
				System.out.println("Last Name:" + a.lname);
				System.out.println("Address:" + a.address);
				System.out.println("City:" + a.city);

				System.out.println("Zip:" + a.zip);
				System.out.println("Phone number:" + a.phone_number);
				System.out.println("E-mail:" + a.email);
				
			}
		}
	}
}