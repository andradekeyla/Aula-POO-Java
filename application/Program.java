package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Employee #" +(i+1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			if(ch == 'n') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				sc.next();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per Hour: ");
				double valuePerHour = sc.nextDouble();
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			} else {
				System.out.print("Name: ");
				String name = sc.nextLine();
				sc.next();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per Hour: ");
				double valuePerHour = sc.nextDouble();
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			}
			
		
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp:list) {
			System.out.println(emp.getName() + " - $ "+ String.format("%.2f", emp.payment()));
		}
		
		sc.close();
		

	}

}
