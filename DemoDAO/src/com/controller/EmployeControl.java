package com.controller;

import java.util.Scanner;

import com.service.EmployeService;

public class EmployeControl {

	public static void main(String[] args) throws Exception {
		EmployeService es=new EmployeService();
		System.out.println("this is controller");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("\nMenu:\n1. Create Table\n2. Insert Data\n3. Update Data\n4. Delete Data\n5. Fetch and Display Data\n6. Exit");
            System.out.print("Enter your choice: ");
		int c=sc.nextInt();
		switch (c) {
		case 1:
			es.CreateTAble();
			break;
		case 2:
			es.InsertData();
			break;
        case 3:
			es.UpdateData();
			break;
        case 4:
			es.DeleteData();
			break;
        case 5:
			es.FetchData();
			break;
		default:
			 System.out.println("Invalid choice. Please enter a valid option.");
			break;
		}
		}
	}

}
