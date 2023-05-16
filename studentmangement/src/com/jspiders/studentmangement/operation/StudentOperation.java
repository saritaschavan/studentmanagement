package com.jspiders.studentmangement.operation;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspiders.studentmangement.student.Student;

public class StudentOperation {

	Student student = new Student();
	Scanner scanner = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<Student>();
	int index = 0;

	public void adddetails() {

		System.out.println("How many students detalis you want to be add:");
		int a = scanner.nextInt();

		for (int i = 0; i < a; i++) {

			list.add(new Student());

			System.out.println("Enter Student id:");
			int id = scanner.nextInt();
			list.get(index).setId(id);

			System.out.println("Enter Student Name:");
			String name = scanner.next();
			list.get(index).setName(name);

			System.out.println("Enter Student Email_id:");
			String email = scanner.next();
			list.get(index).setEmail_id(email);

			System.out.println("Enter Student Mobile_number:");
			long no = scanner.nextLong();
			list.get(index).setMobile_no(no);

			System.out.println(list.size() + " Students details add successfully\n");
			index++;

		}
	}

	public void viewAlldetails() {
		if (list.isEmpty()) {
			System.out.println("Details are not present..Please add the details first\n");
			adddetails();
		} else {
			int a = 1;
			for (Student var : list) {
				System.out.println(a + " " + var);
				a++;
			}
			System.out.println();
			}
	}

	public void removedetails() {
		if (list.isEmpty()) {
			System.out.println("Details are not present..Please add the details first\n");
			adddetails();
		}
		System.out.println("Please select the details for remove the students");
		viewAlldetails();
		int remove = scanner.nextInt();
		System.out.println(list.get(remove - 1).getName() + " remove successfully \n");
		list.remove(remove - 1);
		System.out.println("Reaming students details: \n");
		viewAlldetails();
	}

	public void editDetails() {
		if (list.isEmpty()) {
			System.out.println("Details are not present..Please add the details first\n");
			adddetails();
		}
		System.out.println("Select details to edit..");
		viewAlldetails();
		int edit = scanner.nextInt();
		boolean loop = true;
		while (loop) {
			System.out.println("which records you want to be edit\n" + "1.Student id\n" + "2.Student name\n"
					+ "3.Student email-id\n" + "4.Student mobile-no\n" + "5.Back");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Student id:");
				int id = scanner.nextInt();
				list.get(edit - 1).setId(id);
				break;

			case 2:
				System.out.println("Enter Student Name:");
				String name = scanner.next();
				list.get(edit - 1).setName(name);
				break;

			case 3:
				System.out.println("Enter Student Email-id:");
				String email = scanner.next();
				list.get(edit - 1).setEmail_id(email);
				break;

			case 4:
				System.out.println("Enter Student Mobile_no:");
				long no = scanner.nextLong();
				list.get(edit - 1).setMobile_no(no);
				break;

			case 5:
				loop = false;
				break;

			default:
				System.out.println("Invalid choice..");
				break;
			}

		}
		
		System.out.println("Record edit Successfully..\n");
		viewAlldetails();
	}
}
