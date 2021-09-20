package addressbook;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MultiAddress {
	static int choice;
	static int counter = 0;
	static Scanner sc = new Scanner(System.in);

	/*
	 * this method has 2 parameters this method will use object to call methods from
	 * addressbook class based on choice parameter
	 */
	public static void choose(int choice, addressbook obj) {
		switch (choice) {
		case 1:
			obj.insertContact();
			break;
		case 2:
			obj.editContact();
			break;
		case 3:
			obj.displayContact();
			break;
		case 4:
			obj.deleteContact();
			break;
		case 7:
			obj.findPerson();
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addressbook obj = new addressbook();
		Hashtable<String, addressbook> multiaddress = new Hashtable<String, addressbook>();

		String k = "addressbook1";
		multiaddress.put(k, obj);

		String addname = " ";

		while (counter != 1) {
			System.out.println(
					"enter the choice 1.Add 2.edit 3.Display 4.delete 5.add addressbook 6.exit 7. city 8.view by city,9.sort by name,10.sort by city/zip");
			choice = sc.nextInt();
			if (choice == 5) {

				System.out.println("Enter addressbook name");
				addressbook obj1 = new addressbook();
				addname = sc.next();
				multiaddress.put(addname, obj1);
			} else if (choice == 6) {
				counter = 1;
				System.out.println("exited");
			} else if (choice == 8) {
				for (Map.Entry<String, addressbook> entry : multiaddress.entrySet()) {
					addressbook add = entry.getValue();

					System.out.println("addressbook is ::" + entry.getKey());
					add.dictionary();
				}
			} else if (choice == 9) {
				for (Map.Entry<String, addressbook> entry : multiaddress.entrySet()) {
					addressbook object1 = entry.getValue();
					System.out.println("Addressbook:" + entry.getKey());
					object1.sortname();
				}
			}

			else if (choice == 10) {
				System.out.println("sort By 1city 2.zip");
				int option = sc.nextInt();
				for (Map.Entry<String, addressbook> entry : multiaddress.entrySet()) {
					addressbook object1 = entry.getValue();
					System.out.println("Addressbook:" + entry.getKey());
					object1.sortPersonByNameCityStateZip(option);
				}
			}

			else {
				System.out.println("Enter addressbook name::");
				addname = sc.next();
				choose(choice, multiaddress.get(addname));
			}

		}

	}

}
