package com.gaurav.javafromnotes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparotorDemo {

	public static void main(String[] args) {

		ArrayList<Employee> employeeList = new ArrayList<Employee>();

		Employee gaurav = new Employee("Gaurav", "Mumbai", 45000.0);
		Employee varun = new Employee("Varun", "California", 48000.0);
		Employee shubham = new Employee("Shubham", "Manchester", 46000.0);
		Employee abhishek = new Employee("Abhishek", "Sydney", 50000.0);

		employeeList.add(shubham);
		employeeList.add(varun);
		employeeList.add(abhishek);
		employeeList.add(gaurav);

		System.out.println("Unsorted List: ");

		for (Employee emp : employeeList) {
			System.out.println(emp.getName() + "  " + emp.getLocation() + "  " + emp.getSalary());
		}

		// Collections.sort(employeeList); // here we get an error saying The method
		// sort(List<T>) in the type Collections is not applicable for the arguments
		// (ArrayList<Employee>)

		//Collections.sort(employeeList);
		
		comparatorSortByNameA(employeeList);
		comparatorSortByNameD(employeeList);
		comparatorSortByLocationA(employeeList);
		comparatorSortByLocationD(employeeList);
		comparatorSortBySalaryA(employeeList);
		comparatorSortBySalaryD(employeeList);

	}

	private static void comparatorSortBySalaryD(ArrayList<Employee> employeeList) {
		Collections.sort(employeeList, new Ds());

		System.out.println("************************");

		System.out.println("Sorted List By Salary Desc: ");

		for (Employee emp : employeeList) {
			System.out.println(emp.getName() + "  " + emp.getLocation() + "  " + emp.getSalary());
		}
	}

	private static void comparatorSortBySalaryA(ArrayList<Employee> employeeList) {
		Collections.sort(employeeList, new As());

		System.out.println("************************");

		System.out.println("Sorted List By Salary Asc: ");

		for (Employee emp : employeeList) {
			System.out.println(emp.getName() + "  " + emp.getLocation() + "  " + emp.getSalary());
		}
	}

	private static void comparatorSortByLocationD(ArrayList<Employee> employeeList) {
		Collections.sort(employeeList, new Dl());

		System.out.println("************************");

		System.out.println("Sorted List By Location Desc: ");

		for (Employee emp : employeeList) {
			System.out.println(emp.getName() + "  " + emp.getLocation() + "  " + emp.getSalary());
		}
	}

	private static void comparatorSortByLocationA(ArrayList<Employee> employeeList) {
		Collections.sort(employeeList, new Al());

		System.out.println("************************");

		System.out.println("Sorted List By Location Asc: ");

		for (Employee emp : employeeList) {
			System.out.println(emp.getName() + "  " + emp.getLocation() + "  " + emp.getSalary());
		}
	}

	private static void comparatorSortByNameD(ArrayList<Employee> employeeList) {
		Collections.sort(employeeList, new Dn());

		System.out.println("************************");

		System.out.println("Sorted List By Name Desc: ");

		for (Employee emp : employeeList) {
			System.out.println(emp.getName() + "  " + emp.getLocation() + "  " + emp.getSalary());
		}
	}

	private static void comparatorSortByNameA(ArrayList<Employee> employeeList) {
		Collections.sort(employeeList, new An());
		

		System.out.println("************************");

		System.out.println("Sorted List By Name Asc: ");

		for (Employee emp : employeeList) {
			System.out.println(emp.getName() + "  " + emp.getLocation() + "  " + emp.getSalary());
		}
	}

}

class An implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

class Dn implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getName().compareTo(o1.getName());
	}

}

class Al implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getLocation().compareTo(o2.getLocation());
	}

}

class Dl implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getLocation().compareTo(o1.getLocation());
	}

}

class As implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSalary().compareTo(o2.getSalary());
	}

}

class Ds implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getSalary().compareTo(o1.getSalary());
	}

}

class Employee implements Comparable<Employee> {

	String name, location;
	Double salary;

	Employee(String name, String location, Double salary) {
		this.name = name;
		this.location = location;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		return (int) (this.salary - o.getSalary());
	}
}
