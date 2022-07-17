package com.bridgelabz;
import java.util.Scanner;
public class AddressBook {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome To Address Book");
		Contact contact = addContact();
		System.out.println(contact);
	}

	private static Contact addContact() {
		Contact contact = new Contact();
		System.out.println("Enter First Name:");
		contact.setFirstName(scanner.next());
		System.out.println("Enter last name:");
		contact.setLastName(scanner.next());
		System.out.println("Enter address:");
		contact.setAddress(scanner.next());
		System.out.println("Enter City:");
		contact.setcity(scanner.next());
		System.out.println("Enter State:");
		contact.setstate(scanner.next());
		System.out.println("Enter Zip:");
		contact.setzip(scanner.next());
		System.out.println("Enter Phone Number:");
		contact.setphoneNumber(scanner.next());
		System.out.println("Enter email:");
		contact.setemail(scanner.next());
		System.out.println();
		System.out.println(contact);
		System.out.println();
		System.out.println("Edit First name:");
		contact.setFirstName(scanner.next());
		return contact;
	}
}
