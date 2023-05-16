package com.jspiders.studentmangement.mangement;

import java.util.Scanner;

import com.jspiders.studentmangement.operation.StudentOperation;

public class StudentMangement {

	static StudentOperation operation = new StudentOperation();
	static boolean loop = true;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (loop) {
			operation();
		}
	}

	public static void operation() {

		System.out.println("Select the option:\n" + "1.View Student details\n" + "2.Add detalis\n"
				+ "3.Remove student details\n" + "4.Update Student details\n" + "5.Exit");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			operation.viewAlldetails();
			break;

		case 2:
			operation.adddetails();
			break;

		case 3:
			operation.removedetails();
			break;

		case 4:
			operation.editDetails();
			break;
		case 5:
			System.out.println("Thank You :)\n");
			return;
		default:
			System.out.println("Invalid choice..");
			break;

		}
	}
}
